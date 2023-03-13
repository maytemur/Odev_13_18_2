<%@page import="com.notepet.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html><head><title>Guncelle Page</title></head>
                <body onLoad="document.buform.username.focus()">   
<form name="buform" action="updatewithservlet.jsp" method=post>
        <% String usersession=(String)session.getAttribute("username");
            if(usersession==null){
                response.sendRedirect("index.jsp");
            }
        %>
        <%
            database_connect updatebaglan=new database_connect();
            Connection updatecon=updatebaglan.getConnection();
            String sql="select * from portaldatabase where username=?";
            PreparedStatement updstm=updatecon.prepareStatement(sql);

            updstm.setString(1,usersession);
            ResultSet sonuc=updstm.executeQuery();
            if (sonuc.next()){
                String usr=sonuc.getString("username");
                String pss=sonuc.getString("password");
                String nm=sonuc.getString("name");
                String sn=sonuc.getString("surname");
                String em=sonuc.getString("email");
            }
        %>
<table>   
    <tr><td>Username:</td><td><input type="hidden" name="username" 
        value='<%=sonuc.getString("username")%>'>Kullanici isminiz<br>
    </td></tr>
    <tr><td>Password:</td><td><input type="password" name="password" 
    value='<%=sonuc.getString("password")%>'><td></td>
    <br></td></tr>    
    <tr><td>Name:</td><td><input type="text" name="name" 
    value='<%=sonuc.getString("name")%>'><br></td></tr>    
    <tr><td>Surname:</td><td><input type="text" name="surname" 
        value='<%=sonuc.getString("surname")%>'>
    </td></tr>    
    <tr><td>E-mail:</td><td><input type="text" name="email" 
    value='<%=sonuc.getString("email")%>'><br></td></tr>
</table>        <table>
        <tr><td><input type="submit" value="Guncelle" value="">
        <input type="reset" value="Reset"></td></tr></table></form></body></html>