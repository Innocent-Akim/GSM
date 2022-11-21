/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.load;

import java.util.List;
import lib.loading.IPersonne;
import lib.model.Personne;

/**
 *
 * @author PC
 */
public class Personnel implements IPersonne{

    @Override
    public List<Personne> findAll() {
        
        
        return null;
     
    }

    @Override
    public List<?> filter(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
