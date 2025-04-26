package gestionbibliotheque.models;
import gestionbibliotheque.interfaces.Empruntable;

public abstract class Document implements Empruntable {

    protected int id;
    protected String titre;
    protected int anneePublication;
    protected boolean disponible;
    protected int emprunteurId;

    public Document(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
        this.disponible = true;
        this.emprunteurId = -1;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract void afficherDetails();
    
    public int getId(){
        return id;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }
    
    @Override
    public boolean emprunter(int utilisateurId) {
        if (disponible) {
            disponible = false;
            emprunteurId = utilisateurId;

            return true;
        }
        return false;

    }

    @Override
    public boolean retourner() {
        if (!disponible) {
            disponible = true;
            emprunteurId = -1;
            return true;
        }
        return false;
    }

}
