package gestionbibliotheque.models;

public abstract class Document {
    protected int id;
    protected String titre;
    protected int anneePublication;

    public Document(int id, String titre, int anneePublication) {
        this.id = id;
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    public abstract void afficherDetails();
}





