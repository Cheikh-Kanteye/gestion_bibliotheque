package gestionbibliotheque.models;

import gestionbibliotheque.interfaces.Empruntable;


public class Livre extends Document implements Empruntable{
    private final String auteur;
    private final int nombrePages;
    private boolean disponible;

    public Livre(String titre, int anneePublication, String auteur, int nombrePages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }


    @Override
    public void afficherDetails() {
        System.out.println(" Livre:");
        System.out.println("ID: " + id);
        System.out.println("Titre: " + titre);
        System.out.println("Année: " + anneePublication);
        System.out.println("Auteur: " + auteur);
        System.out.println("Pages: " + nombrePages);
        System.out.println("Disponibilité: " + (disponible ? "Disponible" : "Emprunté"));
    }

    @Override
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println(" Livre emprunté : " + titre);
        } else {
            System.out.println("Ce livre est déjà emprunté.");
        }
    }
   

    @Override
    public boolean retourner() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void estDisponible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
