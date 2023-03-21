package Controller;

import Model.Connexion;
import Model.Login;
import View.Accueil;
import View.Contact_etudiant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Controleur
{
    private Connection con = Connexion.getConnexion();
    private Accueil ac1 = new Accueil();
    private Contact_etudiant ce1 = new Contact_etudiant();

    public Controleur(){}

    public void lancerApplication()
    {
        ac1.afficherAccueil();
        System.out.println(con);
    }

}
