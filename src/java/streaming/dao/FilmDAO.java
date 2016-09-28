/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author Laurent-LIM
 */
public class FilmDAO {
    
    public List<Film> listerFilms(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        List<Film> films = em.createQuery("SELECT f FROM Film f ORDER BY ASC").getResultList();
        
        return films;
    }
}
