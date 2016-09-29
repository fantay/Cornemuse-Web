/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author Laurent-LIM
 */
public class FilmService {

    public List<Film> lister() {
        return new FilmDAO().listerFilms();
    }

    public Film rechercheFilmByID(long id) {
        return new FilmDAO().rechercheFilmByID(id);
    }

    public void ajouterFilms(Film f){
        new FilmDAO().ajouterFilms(f);
    }
    
    public void supprimerFilm(long id){
        new FilmDAO().supprimerFilm(id);
    }
    
    public void modifierFilms(Film f){
        new FilmDAO().modifierFilms(f);
    }
    

}
