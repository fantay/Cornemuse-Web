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
}
