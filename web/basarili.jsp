<%@page import="com.notepet.database_manager"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<jsp:useBean id="formBakim" class="com.notepet.FormBean" scope="request"/>
<html>
    <body>
     
        <li>Username:<jsp:getProperty name="formBakim" property="username"/><br>
        Password   :<jsp:getProperty name="formBakim" property="password"/><br>
        Name      :<jsp:getProperty name="formBakim" property="name"/><br>
        Surname    :<jsp:getProperty name="formBakim" property="surname"/><br>        
        Email        :<jsp:getProperty name="formBakim" property="email"/><br>        
        <h1>Eklenme islemi yapildi</h1>
        <a href=index.jsp>Index</a>
    </body>
</html>