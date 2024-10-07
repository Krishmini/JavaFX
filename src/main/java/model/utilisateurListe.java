package model;

public class utilisateurListe {
    private int refUtilisateur;
    private int refListe;
    public utilisateurListe(int refUtilisateur, int refListe) {
        this.refUtilisateur = refUtilisateur;
        this.refListe = refListe;
    }
    public int getRefUtilisateur() {
        return refUtilisateur;
    }

    public void setRefUtilisateur(int refUtilisateur) {
        this.refUtilisateur = refUtilisateur;
    }

    public int getRefListe() {
        return refListe;
    }

    public void setRefListe(int refListe) {
        this.refListe = refListe;
    }

    @Override
    public String toString() {
        return "utilisateur_liste{" +
                "refUtilisateur=" + refUtilisateur +
                ", refListe=" + refListe +
                '}';
    }
}
