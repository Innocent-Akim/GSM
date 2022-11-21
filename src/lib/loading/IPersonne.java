/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.loading;

import java.util.List;
import lib.model.Personne;

/**
 *
 * @author PC
 */
public interface IPersonne {

    public List<?> findAll();

    public List<?> filter(String value);

    public boolean save(Personne personne);

}
