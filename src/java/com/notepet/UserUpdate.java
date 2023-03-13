package com.notepet;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.notepet.FormBean;
import java.sql.*;
import java.sql.Driver;

public class UserUpdate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            FormBean f = (FormBean) request.getAttribute("formBakim");
            
            String username=f.getUsername();
            String password=f.getPassword();
            String name=f.getName();
            String surname=f.getSurname();
            String email=f.getEmail();
            
            database_connect servletbaglan=new database_connect();
            Connection servletcon=servletbaglan.getConnection();
            String sql="update portaldatabase set password=?,name=?,surname=?,email=? where username=?";
            PreparedStatement updateyap=servletcon.prepareStatement(sql);       
 
            updateyap.setString(1,password);
            updateyap.setString(2,name);
            updateyap.setString(3,surname);
            updateyap.setString(4,email);
            updateyap.setString(5,username);
            
            int sonuc=updateyap.executeUpdate();                       
  
            getServletConfig().getServletContext().getRequestDispatcher("/basarili.jsp").
                    forward(request, response);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}