package View;

import Model.RepositoryEtudiant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Table extends JFrame{
    private JTable table1;
    private JPanel panel1;

    public void afficherTable()
    {
        RepositoryEtudiant etudiant = new RepositoryEtudiant();

        String[][] data = new String[etudiant.compterEtudiant()][3];

        String entete[] = {"ID","Nom","Prenom"};

        try{
            int i = 0;
            ResultSet list = etudiant.getAllEtudiant();

            while(list.next())
            {
                int id = list.getInt("idEtud");
                String nom = list.getString("nom");
                String prenom = list.getString("prenom");
                data[i][0] = id + "";
                data[i][1] = nom;
                data[i][2] = prenom;
                i++;
            }

            DefaultTableModel model = new DefaultTableModel(data,entete);

            table1.setModel(model);
            this.setSize(500,350);
            setResizable(true);
            setLocationRelativeTo(null);
            setVisible(true);
            setContentPane(panel1);


        }catch (SQLException event){
            event.printStackTrace();
        }


    }
}
