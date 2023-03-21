package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComboBoxBac
{
    public ResultSet afficherBac() {
        Connection con = Connexion.getConnexion();
        ResultSet resultat = null;
        java.sql.Statement stmt;
        try {
            String requete = "SELECT * FROM bac";
            stmt = con.createStatement();
            resultat = stmt.executeQuery(requete);
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

        return resultat;
    }
}
