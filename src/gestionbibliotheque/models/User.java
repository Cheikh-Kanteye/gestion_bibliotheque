/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliotheque.models;

import gestionbibliotheque.interfaces.Empruntable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chika
 */
public class User {
    private int id;
    private String nom;
    private String prenom; 
    private List<Document> emprunts;
    private static int counter = 1;
    
    public User(String nom, String prenom){
        this.id = counter;
        counter++;
        
        this.prenom = prenom;
        this.nom = nom;
        this.emprunts = new ArrayList<>();
    }
    
    
    public boolean retournerDocument(Document document){
        if(document instanceof Empruntable){
            Empruntable empruntable = (Empruntable) document;
            if(emprunts.contains(document) && empruntable.retourner()){
                emprunts.remove(document);
                return true;
            }
        }
        
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Document> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Document> emprunts) {
        this.emprunts = emprunts;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }
    
    
    
    
    public void ajouterEmprunt(){}
}
