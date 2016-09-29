<%-- 
    Document   : _TEMPLATE
    Created on : 28 sept. 2016, 16:09:16
    Author     : Laurent-LIM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <c:import url="_HEAD.jsp"/>
        <title>JSP Page</title>
    </head>
    
    <body>
        
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <br/>
         <div class="titre">
            TITRE
        </div>     
        <br/>
        <div class="contenu">
            CONTENU
        </div>
        <br/>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
    </body>
    
</html>
