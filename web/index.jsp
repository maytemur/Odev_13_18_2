<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>FORM KAYIT</title></head><body><form action="islemwithservlet.jsp" method=post><table>
    <tr><td>Username:</td><td><input type="text" name="username" value="">Kullanici isminiz<br>
    </td></tr>
    <tr><td>Password:</td><td><input type="password" name="password" value=""><td></td>
    <br></td></tr>    
    <tr><td>Name:</td><td><input type="text" name="name" value=""><br></td></tr>    
    <tr><td>Surname:</td><td><input type="text" name="surname" value="">
    </td></tr>    
    <tr><td>E-mail:</td><td><input type="text" name="email" value=""><br></td></tr>
</table>
   <table>
    <tr><td><input type="submit" value="Yeni Kayıt" value="">
        <input type="reset" value="Reset">
        <input type="button" value="Kayıt Bilgilerimi Degistir" 
        onClick="window.location='degistir.jsp'"></td></tr></table>
    
</form></body></html>