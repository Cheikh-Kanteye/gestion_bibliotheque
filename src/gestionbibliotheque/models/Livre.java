package gestionbibliotheque.models;



public class Livre extends Document {
    private final String auteur;
    private final int nombrePages;


    public Livre(String titre, int anneePublication, String auteur, int nombrePages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nombrePages = nombrePages;

    }


    @Override
    public void afficherDetails() {
        System.out.println(" Livre:");
        System.out.println("ID: " + id);
        System.out.println("Titre: " + titre);
        System.out.println("Année: " + anneePublication);
        System.out.println("Auteur: " + auteur);
        System.out.println("Pages: " + nombrePages);

    }

 
}