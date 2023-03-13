<%@ page import="java.util.*" %>
<%@page import="com.notepet.*"%>

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
    <jsp:forward page="/UserExist"/><%--Web-Inf icinde web.xml dosyasinda servletle ok--%>
<%
   }  else {
%>
    <jsp:forward page="<%=bundle.getString(\"process.hata\")%>"/>
<%
   }
%>