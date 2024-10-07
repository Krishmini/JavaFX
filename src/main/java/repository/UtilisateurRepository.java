package repository;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilisateur;

public class UtilisateurRepository<Utilisateur> {
    private Connection connection;

    public UtilisateurRepository(Connection connection) {
        this.connection = connection;
    }

    public <Utilisateur> boolean inscription(Utilisateur utilisateur) {
        String query = "INSERT INTO Utilisateur (nom, prenom, email, motDePasse) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, utilisateur.getNom());
            statement.setString(2, utilisateur.getPrenom());
            statement.setString(3, utilisateur.getEmail());
            statement.setString(4, utilisateur.getMotDePasse());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Utilisateur getUtilisateurByEmail(String email) {
        String query = "SELECT * FROM Utilisateur WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Utilisateur(resultSet.getString("nom"),
                        resultSet.getString("prenom"),
                        resultSet.getString("email"),
                        resultSet.getString("motDePasse"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
=======
public class UtilisateurRepository {

    private void inscription(){
        if{

        }
        return false
    }

    public String getNomDeLaBase() {
        return nomDeLaBase;
>>>>>>> b03703c3edc65a0ba1e5781447c7efc4dd252db6
    }
}
