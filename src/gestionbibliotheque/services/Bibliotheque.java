/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionbibliotheque.services;
import gestionbibliotheque.models.*;
import java.util.ArrayList;
import java.util.List;

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
    
    public void ajouterUtilisateur(User user){
        users.add(user);
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
            if(doc.getTitre().toLowerCase().contains(titre)){
                resultats.add(doc);
            }
        }
        
        return resultats;
    }
    
    
    public Document rechercherDocumentParID(int id){
        for(Document doc : documents){
            if(doc.getId() == id){
               return doc;
            }
        }
        
        return null;
    }
    
    public User creerUtilisateur(String nom, String prenom){
        User user = new User(nom, prenom);
        ajouterUtilisateur(user);
        
        return user;
    }
    
    public List<User> rechercherUtilisateur(String nom, String prenom){
        List<User> resultats =new ArrayList<>();
        
        for(User user: users){
            if(user.getNom().toLowerCase().contains(nom) || user.getPrenom().toLowerCase().contains(prenom)){
            resultats.add(user);
            }
        }
        
        return resultats;
    }
}
