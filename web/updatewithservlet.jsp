<%@ page import="java.util.*" %>
<%@page import="com.notepet.*"%>
        <% String usersession=(String)session.getAttribute("username");
            if(usersession==null){
                response.sendRedirect("index.jsp");
            }
        %>
<%! 
    ResourceBundle bundle =null;
    public void jspInit() {
        bundle = ResourceBundle.getBundle("com.notepet.data");
    }
%>
<jsp:useBean id="formBakim" class="com.notepet.FormBean" scope="request">

    <jsp:setProperty name="formBakim" property="*"/>
</jsp:useBean>
<% 
    if (formBakim.onay()) {
%>
    <jsp:forward page="/UserUpdate"/><%--Web-Inf icinde web.xml dosyasinda servletle ok--%>
<%
        }  else {
%>
    <jsp:forward page="<%=bundle.getString(\"process.hata\")%>"/>
<%
       }
%>
<%--Userexist yerine uygun bir class ve session ekleme --%>