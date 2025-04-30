package gestionbibliotheque.interfaces;


public interface Empruntable {
    boolean emprunter(int utilisateurId);
    boolean retourner();
}
