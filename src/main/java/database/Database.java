package database;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String serveur ="localhost";
    private String nomDeLaBase ="cours_todolist";
    private String utilisateur ="root";
    private String MotDePasse ="";

=======
public class Database {

    private String serveur = "localhost";
    private String nomDeLaBase = "cours_todolist";

    private String utilisateur = "root";

    private String MotDePasse = "";
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
    public String getServeur() {
        return serveur;
    }

    public void setServeur(String serveur) {
        this.serveur = serveur;
    }

    public String getNomDeLaBase() {
        return nomDeLaBase;
    }

    public void setNomDeLaBase(String nomDeLaBase) {
        this.nomDeLaBase = nomDeLaBase;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        MotDePasse = motDePasse;
    }

    private String getUrl() {
        return "http://localhost/phpmyadmin/index.php?route=/database/structure&db=cours_todolist";
    }

<<<<<<< HEAD
    public Connection getConnexion() {
        try {
            Connection cnx = DriverManager.getConnection(this.getUrl(), this.utilisateur, this.MotDePasse);
=======

    public <SQLException extends Throwable> Connection getConnexion(String url, String utilisateur, String motDePasse) {
        try {
            Database DriverManager = null;
            Connection cnx = DriverManager.getConnexion(this.getUrl(), this.utilisateur, this.MotDePasse);
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
            System.out.println("Etat de la connexion :");
            System.out.println(cnx.isClosed() ? "fermée" : "ouverte \r\n");
            return cnx;
        } catch (SQLException e) {
            System.out.println("erreur lors de la tentative de connexion à la base de données");
            e.printStackTrace();
            return null;
        }
    }
<<<<<<< HEAD

=======
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
}
