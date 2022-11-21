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
public class Personne {

    private String id;
    private String nom;
    private String tel;
    private String email;
    private String jour;

    public Personne(String id, String nom, String tel, String email, String jour) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.jour = jour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", tel=" + tel + ", email=" + email + ", jour=" + jour + '}';
    }

}
