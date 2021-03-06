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
        <title>ajout film</title>
    </head>

    <body>

        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <br/>
        
        <h1>Nouveau film</h1>
        
        <div class="titre">
            
        </div> 

        <br/>

        <div class="contenu">
            
            <form method="POST">
                
                <label>Titre&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input name="titre" type="text"/>
                
                <br/>                
                <br/>
                
                <label>Genre&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <select name="genreID">
                    <c:forEach items="${listeGenre}" var="genreAct">
                        <option value="${genreAct.id}">${genreAct.nom}</option>
                    </c:forEach>
                </select>
                
                <br/>                
                <br/>
                
                <label>Synopsis&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <textarea name="synopsis"></textarea>
                
                <br/>                
                <br/>
                
                <label>Année de production&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input name="anneeprod" type="text"/>
                
                <br/>                
                <br/>
                
                <label>Durée&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </label>
                <input name="duree" type="text"/>
                
                <br/>                
                <br/>
                
                <input type="submit" value="ajouter"/>
                
        </form>

    </div>

    <br/>

    <div class="pied">
        <c:import url="_PIED.jsp"/>
    </div>

</body>

</html>
