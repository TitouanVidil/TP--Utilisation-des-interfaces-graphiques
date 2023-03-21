package Model;

import java.sql.*;

public class Login {
    private String login;
    private String password;

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean verifUser() {
        Connection con = Connexion.getConnexion();
        ResultSet resultat = null;
        boolean test = false;
        java.sql.PreparedStatement pstmt;
        try {
            String requete = "SELECT COUNT(*) as nombre FROM utilisateur WHERE login = ? AND password = ? ";
            pstmt = con.prepareStatement(requete);
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            resultat = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

        try {
            while (resultat.next()) {
                if (resultat.getInt("nombre") == 1)
                    test = true;
                else
                    test = false;
            }
        } catch (SQLException ex) {
            System.out.println("marche pas");
            throw new RuntimeException(ex);
        }

        return test;
    }


}
