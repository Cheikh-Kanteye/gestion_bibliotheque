
public class Livre extends Document {
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    public Livre(int id, String titre, int anneePublication, String auteur, int nombrePages) {
        super(id, titre, anneePublication);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }


    public void afficherDetails() {
        System.out.println(" Livre:");
        System.out.println("ID: " + id);
        System.out.println("Titre: " + titre);
        System.out.println("Année: " + anneePublication);
        System.out.println("Auteur: " + auteur);
        System.out.println("Pages: " + nombrePages);
        System.out.println("Disponibilité: " + (disponible ? "Disponible" : "Emprunté"));
    }

    
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println(" Livre emprunté : " + titre);
        } else {
            System.out.println("Ce livre est déjà emprunté.");
        }
    }

   
    public void retourner() {
        disponible = true;
        System.out.println("Livre retourné : " + titre);
    }

 
    public boolean estDisponible() {
        return disponible;
    }
}
