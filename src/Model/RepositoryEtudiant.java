package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RepositoryEtudiant
{
    private String [] tab = new String[15];

    public RepositoryEtudiant(String [] tab)
    {
        int i = 0;

        for(i=0;i<15;i++)
        {
            this.tab[i] = tab[i];
        }
    }

    public RepositoryEtudiant(){}

    public void ajouterEtudiant() {
        Connection con = Connexion.getConnexion();
        ResultSet resultat = null;
        boolean test = false;
        int i = 0;
        System.out.println("test1");
        java.sql.PreparedStatement pstmt;
        try {
            String requete = "INSERT INTO etudiant(idEtud,nom,prenom,dateNaiss,LieuNaiss,sexe,nationalite,rue,cp,ville,telephone,mail,niveau,idFil,idBac,loisir) VALUES(3,?,?,?,?,?,?,?,?,?,?,?,?,(Select idFil FROM filiere WHERE nom = ?),(Select idBac FROM bac WHERE libelle = ?),?)";
            pstmt = con.prepareStatement(requete);
            for(i=0;i<15;i++)
            {
                pstmt.setString(i+1, tab[i]);
            }
            int rowsAffected = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

    }

        public int compterEtudiant() {
        Connection con = Connexion.getConnexion();
        ResultSet resultat = null;
        int resultint = 0;
        java.sql.Statement stmt;
            try
            {
                String requete = "SELECT COUNT(*) as cpt FROM etudiant";
                stmt = (Statement) con.createStatement();
                resultat = stmt.executeQuery(requete);
            }
            catch(SQLException e)
            {
                System.out.println("Erreur lors du chargement "+e.getMessage());
            }

            try {
                while (resultat.next()) {
                    resultint = resultat.getInt("cpt");
                }
            } catch (SQLException ex) {
                System.out.println("marche pas");
                throw new RuntimeException(ex);
            }

            return resultint;

    }

        public ResultSet getAllEtudiant()
        {
            Connection con = Connexion.getConnexion();
            ResultSet resultat = null;
            java.sql.Statement stmt;
            try
            {
                String requete = "SELECT idEtud, nom, prenom FROM etudiant";
                stmt = (Statement) con.createStatement();
                resultat = stmt.executeQuery(requete);
            }
            catch(SQLException e)
            {
                System.out.println("Erreur lors du chargement "+e.getMessage());
            }

            return resultat;
        }
}
