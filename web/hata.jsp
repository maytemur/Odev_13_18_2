<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<jsp:useBean id="formBakim" class="com.notepet.FormBean" scope="request"/>
<html>
<head>
<title>FORM TEKRARDENE</title></head><body><form action="islemwithservlet.jsp" method=post>
    
    <table>
        <tr><td>Username:</td><td><input type="text" name="username" value='<%=formBakim.getUsername()%>'>Kullanici isminiz<br>
        </td></tr>
        <tr><td><font color=red><%=formBakim.getErrorMsg("username")%></font></td></tr>
        <tr><td>Password:</td><td><input type="password" name="pass" value='<%=formBakim.getPassword()%>'><td></td>
        <br></td></tr>
        <tr><td><font color=red><%=formBakim.getErrorMsg("password")%></font></td></tr>
        <tr><td>Name:</td><td><input type="text" name="name" value='<%=formBakim.getName()%>'><br></td></tr>    
        <tr><td><font color=red><%=formBakim.getErrorMsg("name")%></font></td></tr>
        <tr><td>Surname:</td><td><input type="text" name="surname" value='<%=formBakim.getSurname()%>'>
        </td></tr>
        <tr><td><font color=red><%=formBakim.getErrorMsg("surname")%></font></td></tr>
        <tr><td>E-mail:</td><td><input type="text" name="email" value='<%=formBakim.getEmail()%>'><br></td></tr>
        <tr><td><font color=red><%=formBakim.getErrorMsg("email")%></font></td></tr>
        <input type="submit" value="Submit"> <input type="reset"  
value="Reset">
    </table>   
</form></body></html>