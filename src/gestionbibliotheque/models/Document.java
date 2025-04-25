
package gestionbibliotheque.models;

abstract class Document {
    protected int id;
    protected String titre;
    protected int anneePublication;
    private static int counter = 0;

    public Document(String titre, int anneePublication) {
        this.id = counter;
        counter++; 
        
        this.titre = titre;
        this.anneePublication = anneePublication;
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
    
    
}










