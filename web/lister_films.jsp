<%-- 
    Document   : lister_films
    Created on : 28 sept. 2016, 11:52:10
    Author     : Laurent-LIM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <br/>
        <a href="lister_films">Liste des films</a>
        <br/>
        <a href="liste_serie.html">Liste des séries</a>
        <br/>
        <a href="ajouter_film.html">Ajoute film</a>
        <br/>
        <a href="ajouter_serie.html">Ajouter serie</a>
        <br/>
        <a href="index.html">Retour au menu</a>
        <br/>

        <h1>${titre}</h1>

        <div>
            <c:forEach items="${mesFilms}" var="monFilm">
                ${monFilm.titre}<br/>
            </c:forEach>
        </div>
        <br/>

    </body>
</html>