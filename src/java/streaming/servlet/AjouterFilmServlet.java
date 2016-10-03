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
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author Laurent-LIM
 */
@WebServlet(name = "AjouterFilm", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("listeGenre", new GenreService().lister());
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // creation d'un film
        Film f = new Film();
        
        // creation du genre associer
        Genre g = new GenreService().rechercheByID(Long.valueOf(req.getParameter("genreID")));
        
        
        // remplissage du film avec les données du formulaire
        f.setTitre(req.getParameter("titre"));
        f.setSynopsis(req.getParameter("synopsis"));
        f.setAnnee(Integer.valueOf(req.getParameter("anneeprod")));
        f.setDuree(Integer.valueOf(req.getParameter("duree")));
        f.setGenre(g);
        g.getFilms().add(f);
        
        new FilmService().ajouterFilms(f);
        
        resp.sendRedirect("lister_films");
        
    }

}
