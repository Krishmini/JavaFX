package model;

public class liste {
    private int idListe;
    private String nom;
    public liste(int idListe, String nom) {
        this.idListe = idListe;
        this.nom = nom;
    }

    public int getIdListe() {
        return idListe;
    }

    public void setIdListe(int idListe) {
        this.idListe = idListe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "liste{" +
                "idListe=" + idListe +
                ", nom='" + nom + '\'' +
                '}';
    }

}
