
package gestionbibliotheque.models;

public class Magazine extends Document {
    private int numero;


    public Magazine(int id, String titre, int anneePublication, int numero) {
        super(titre, anneePublication);
        this.numero = numero;

    }

   
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
}
