/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author Laurent-LIM
 */
public class SerieService {
    
    public List<Serie> lister(){
        return new SerieDAO().listerSeries();
    }
    
    public Serie rechercheSerieByID(long id){
        return new SerieDAO().rechercheSerieByID(id);
    }
    
    public void ajouterSerie(Serie s){
        new SerieDAO().ajouterSerie(s);
    }
    
    public void supprimerSerie(long id){
        new SerieDAO().supprimerSerie(id);
    }
    
    public void modifierSerie(Serie s){
        new SerieDAO().modifierSerie(s);
    }
    
}
