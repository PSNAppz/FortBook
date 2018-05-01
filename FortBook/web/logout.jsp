<%-- 
    Document   : logout
    Created on : 14 Apr, 2018, 10:20:09 AM
    Author     : psn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");

    %>

