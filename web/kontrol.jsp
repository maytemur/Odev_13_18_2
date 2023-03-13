<%@ page import="java.util.*" %>
<%@page import="com.notepet.*"%>
<% String username=request.getParameter("username");
session.setAttribute("username",username);
%>
<jsp:useBean id="formPass" class="com.notepet.PassBean" scope="request">
    <jsp:setProperty name="formPass" property="*"/>        
</jsp:useBean>

<%--PassBean classi username i aliyor ama password u almiyor?--%>

<jsp:forward page="/UserPass"/><%--Web-Inf icinde web.xml dosyasinda servletle ok--%>