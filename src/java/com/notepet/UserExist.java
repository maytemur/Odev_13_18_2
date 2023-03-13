package com.notepet;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.notepet.FormBean;
import java.sql.*;
import java.sql.Driver;

public class UserExist extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            FormBean f = (FormBean) request.getAttribute("formBakim");
            boolean userExists = false;
            
            database_connect servletbaglan=new database_connect();
            Connection servletcon=servletbaglan.getConnection();
            Statement advstmt=servletcon.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet advrs=advstmt.executeQuery("select * from portaldatabase");
            while(advrs.next()){
                if(advrs.getString("username").equals(f.getUsername())){
                    userExists=true;
                }
            }
            if (userExists) {
                f.setErrors("username","Duplicate User: Try a different username");
                getServletConfig().getServletContext().getRequestDispatcher("hata.jsp").forward(request, response);
            } else {
// Bilgiler burada alinarak koyulabilecegi gibi success icindede yapilabilir.
                //retrieve the bean properties and store them
                // into the database.
                String username=f.getUsername();
                String password=f.getPassword();
                String name=f.getName();
                String surname=f.getSurname();
                String email=f.getEmail();
                
                database_manager advm=new database_manager() ;                                
                advm.ekle(username,password,name,surname,email) ;
                getServletConfig().getServletContext().getRequestDispatcher("/basarili.jsp").
                        forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


