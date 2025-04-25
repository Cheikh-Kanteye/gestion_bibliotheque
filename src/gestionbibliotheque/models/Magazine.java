
package gestionbibliotheque.models;


public class Magazine extends Document {
    private int numero;


    public Magazine(int id, String titre, int anneePublication, int numero) {
        super(titre, anneePublication);
        this.numero = numero;

    }

   
    @Override
    public void afficherDetails() {
        System.out.println(" Magazine :");
        System.out.println("ID: " + id);
        System.out.println("Titre: " + titre);
        System.out.println("Année: " + anneePublication);
        System.out.println("Numéro: " + numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
