/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.model;

/**
 *
 * @author PC
 */
public class Envoie {

    private String id;
    private String idPersonne;
    private String idMessage;

    public Envoie(String id, String idPersonne, String idMessage) {
        this.id = id;
        this.idPersonne = idPersonne;
        this.idMessage = idMessage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(String idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(String idMessage) {
        this.idMessage = idMessage;
    }

    @Override
    public String toString() {
        return "Envoie{" + "id=" + id + ", idPersonne=" + idPersonne + ", idMessage=" + idMessage + '}';
    }

}
