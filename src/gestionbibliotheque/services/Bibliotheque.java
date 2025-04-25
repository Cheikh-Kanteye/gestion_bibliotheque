/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliotheque.services;

import gestionbibliotheque.models.Livre;
import gestionbibliotheque.models.Magazine;
import gestionbibliotheque.models.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;

/**
 *
 * @author chika
 */
public class Bibliotheque {
    private List<Document> documents;
    private List<User> users;
    
    
    
    public Bibliotheque(){
        this.documents = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    
    
    public void ajouterDocument(Document document){
        documents.add(document);
    }
    
    public Livre creerLivre(String titre, int anneePublication, String auteur, int nombrePages){
        Livre livre = new Livre(titre, anneePublication, auteur, nombrePages);
        ajouterDocument((Document) livre);
        return livre;
    }
    
    
    public Magazine creerMagazine(String titre, int anneePublication, int numero){
        Magazine magazine = new Magazine(titre, anneePublication, numero);
        ajouterDocument((Document) magazine);
        return magazine;
    }
    
    
    public List<Document> rechercherDocument(String titre){
        List<Document> resultats = new ArrayList<>();
        
        for(Document doc : documents){
            
        }
    }
}
