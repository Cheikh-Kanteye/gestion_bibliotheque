/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliotheque.services;

import gestionbibliotheque.models.Livre;
import java.util.Scanner;

/**
 *
 * @author chika
 */
public class BibliothequeConsole {

    Scanner sc = new Scanner(System.in);
    private Bibliotheque bibliotheque;

    public BibliothequeConsole(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public void afficherMenu() {
        System.out.println("Choisir ce que vous voulez faire: ");
        System.out.println("1. Ajouter document");
        System.out.println("2. Rechercher document");
        System.out.println("3. Ajouter utilisateur");
        System.out.println("4. Rechercher utilisateur");
        System.out.println("5. Preter livre");
        System.out.println("6. Retourner livre");
        System.out.println("7. Pour quitter l'application");
    }

    public void traiterChoix() {
       while(true){
        afficherMenu();
        System.out.print("Choix: ");
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                ajouterLivre();
                break;
            case 7:
                return;
            default:
                throw new AssertionError();
        }
       }
    }

    public void ajouterLivre() {
        System.out.println("Saisir le type de document a jouter: ");
        System.out.println("1. Livre");
        System.out.println("2. Magazine");
        System.out.print("Choix: ");
        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {
            System.out.println("Ajouter les information du livre: ");
            System.out.print("Titre: ");
            String titre = sc.nextLine();
            System.out.print("Année de publication: ");
            int annee = sc.nextInt();
            sc.nextLine();
            System.out.print("Auteur: ");
            String auteur = sc.nextLine();
            System.out.print("Nombre de Pages: ");
            int pages = sc.nextInt();
            sc.nextLine();

            Livre livre = bibliotheque.creerLivre(titre, annee, auteur, pages);
            System.out.println("Livre creer: ");
            livre.afficherDetails();
        } else if (opt == 2) {
            //creer magazinne
        } else {
            System.out.println("Choix incorect");
        }
    }
}
