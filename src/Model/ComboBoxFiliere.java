package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComboBoxFiliere
{
    public ResultSet afficherFiliere() {
        Connection con = Connexion.getConnexion();
        ResultSet resultat = null;
        java.sql.Statement stmt;
        try {
            String requete = "SELECT * FROM filiere";
            stmt = con.createStatement();
            resultat = stmt.executeQuery(requete);
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

        return resultat;
    }
}
