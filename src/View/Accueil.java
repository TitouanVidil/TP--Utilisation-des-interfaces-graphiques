package View;

import Model.ComboBoxBac;
import Model.ComboBoxFiliere;
import Model.Connexion;
import Model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class Accueil extends JFrame {
    private JPanel panel1;
    private JButton annulerButton;
    private JButton confirmerButton;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public Accueil()
    {
        confirmerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                Contact_etudiant ce1 = new Contact_etudiant();

                String login = textField1.getText();
                String password = String.valueOf(passwordField1.getPassword());

                ComboBoxFiliere fil1 = new ComboBoxFiliere();
                ComboBoxBac bac1 = new ComboBoxBac();
                Login l1 = new Login(login,password);

                if(l1.verifUser())
                {
                    System.out.println("salut");
                    try {
                        ce1.afficherContactEtudiant(fil1.afficherFiliere(),bac1.afficherBac());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    setVisible(false);
                }

            }
        });
        annulerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void afficherAccueil()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,300);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(panel1);
    }
}
