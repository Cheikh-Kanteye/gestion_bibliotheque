/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbibliotheque;

import gestionbibliotheque.services.Bibliotheque;
import gestionbibliotheque.services.BibliothequeConsole;

/**
 *
 * @author chika
 */
public class GestionBibliotheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bibliotheque bibliotheque = new Bibliotheque();
        BibliothequeConsole bibliothequeConsole = new BibliothequeConsole(bibliotheque);
        
        //Traiter les choix
        bibliothequeConsole.traiterChoix();
        
    }
    
}
