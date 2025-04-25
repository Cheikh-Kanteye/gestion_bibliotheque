/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliotheque.services;

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
    
    
}
