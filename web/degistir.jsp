<%@page import="com.notepet.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html><body onLoad="document.degistir.username.focus()">
    <head><title>Giris Page</title></head>
    <form name="degistir" action="kontrol.jsp" method=post><table>
        <tr><td>Username:</td><td><input type="text" name="username" value="">Kullanici isminiz<br>
        </td></tr>
        <tr><td>Password:</td><td><input type="password" name="password1" value=""><td></td>
        <br></td></tr>    
        <tr><td align="center"><input type="submit" value="OK" value=""></td></tr>
    </form>
</body>
</html>