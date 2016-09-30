/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.service.FilmService;

/**
 *
 * @author Laurent-LIM
 */
@WebServlet(name = "SuppremerFilmServlet", urlPatterns = {"/supprimer_film"})
public class SupprimerFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        long id = Long.valueOf(req.getParameter("monID"));
        
        new FilmService().supprimerFilm(id);
        
        resp.sendRedirect("lister_films");
        
    }

        
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

    

}
