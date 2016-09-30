/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author Laurent-LIM
 */
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/lister_films"})
public class ListerFilmsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Film> films = new FilmService().lister(); // recuperation de la liste des films en appelant le service
        
        req.setAttribute("titre", "TEST LISTE FILMS");
        req.setAttribute("mesFilms", films);
        
        req.getRequestDispatcher("lister_films.jsp").forward(req, resp);     
    }


    
 
}
