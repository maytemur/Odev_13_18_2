package com.notepet;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.notepet.PassBean;
import com.notepet.FormBean;
import java.sql.*;
import java.sql.Driver;
public class UserPass extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            PassBean pass = (PassBean) request.getAttribute("formPass");
            String kullanici=pass.getUsername();
            String passw=pass.getPassword1();
            
            database_connect servletbaglan=new database_connect();
            Connection servletcon=servletbaglan.getConnection();
            String sql="select * from portaldatabase where username=? and password=?";
            PreparedStatement sel=servletcon.prepareStatement(sql);
            
            sel.setString(1,kullanici);
            sel.setString(2,passw);            
            ResultSet rs=sel.executeQuery();
            if (rs.next()) { 
                FormBean f=new FormBean();
                f.setUsername(rs.getString("username"));
                f.setPassword(rs.getString("password"));
                f.setName(rs.getString("name"));
                f.setSurname(rs.getString("surname"));
                f.setEmail(rs.getString("email"));
                
                getServletConfig().getServletContext().getRequestDispatcher("/update.jsp").forward(request, response);
            } else {
                getServletConfig().getServletContext().getRequestDispatcher("/kullaniciyok.jsp").
                        forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}