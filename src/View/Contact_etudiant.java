package View;

import Model.RepositoryEtudiant;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class Contact_etudiant extends JFrame
{
    private JTextField textField6;
    private JTextField textField13;
    private JTextField textField7;
    private JTextField textField1;
    private JTextField textField2;
    private JFormattedTextField dateField3;
    private JTextField textField4;
    private JTextField textField5;
    private JRadioButton hommeRadioButton;
    private JRadioButton femmeRadioButton;
    private JCheckBox sportsCheckBox;
    private JCheckBox musiqueCheckBox;
    private JCheckBox voyagesCheckBox;
    private JCheckBox lectureCheckBox;
    private JPanel PanelContactEtudiant;
    private JFormattedTextField telephoneField8;
    private JTextField textField9;
    private JPanel panelTitre;
    private JPanel panelButton;
    private JPanel panelCentre;
    private JPanel PanelCentreGauche;
    private JPanel PanelCentreDroit;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton validerButton;
    private JButton quitterButton;
    private JButton resetButton;

    private ButtonGroup groupe = new ButtonGroup();

    public Contact_etudiant()
    {
        /*hommeRadioButton.setText("Homme");
        femmeRadioButton.setText("Femme");
        groupe.add(hommeRadioButton);
        groupe.add(femmeRadioButton);*/
        try {
            String validCharacters = "0123456789";
            MaskFormatter maskTel = new MaskFormatter("+33 # ## ## ## ##");
            MaskFormatter maskDate = new MaskFormatter("####-##-##");
            maskDate.setValidCharacters(validCharacters);
            maskTel.setValidCharacters(validCharacters);
            maskTel.install(telephoneField8);
            maskDate.install(dateField3);
        } catch (ParseException b) {
            b.printStackTrace();
        }

        validerButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               /*boolean selection = groupe.getSelection().isSelected();
               System.out.println(groupe.getSelection());*/
               String loisir = "";
               String valueButton = "";

                if(hommeRadioButton.isSelected())
                {
                    valueButton = hommeRadioButton.getText();
                }
                else if(femmeRadioButton.isSelected())
                {
                    valueButton = femmeRadioButton.getText();
                }
                else
                {
                    System.out.println("Aucun bouton radio sélectionné.");
                }

                if(sportsCheckBox.isSelected())
                {
                    loisir += sportsCheckBox.getText() + " ";
                    //System.out.println(sportsCheckBox.getText());
                }

                if(musiqueCheckBox.isSelected())
                {
                    loisir += musiqueCheckBox.getText() + " ";
                    //System.out.println(musiqueCheckBox.getText());
                }

                if(voyagesCheckBox.isSelected())
                {
                    loisir += voyagesCheckBox.getText() + " ";
                    //System.out.println(voyagesCheckBox.getText());
                }

                if(lectureCheckBox.isSelected())
                {
                    loisir += lectureCheckBox.getText() + " ";
                    //System.out.println(lectureCheckBox.getText());
                }

                System.out.println(loisir);

               /* if (selection != false) {
                    System.out.println("Le radio est: "+ groupe.getSelection().getActionCommand());
                } else {
                    System.out.println("Aucun bouton radio sélectionné.");
                }*/


                //System.out.println(valueButton.);

                String [] tab = new String[15];

                tab[0] = textField1.getText();
                tab[1] = textField2.getText();
                tab[2] = dateField3.getText();
                tab[3] = textField4.getText();
                tab[4] = valueButton;
                tab[5] = textField5.getText();
                tab[6] = textField6.getText();
                tab[7] = textField13.getText();
                tab[8] = textField7.getText();
                tab[9] = telephoneField8.getText();
                tab[10] = textField9.getText();
                tab[11] = (String) comboBox2.getSelectedItem();
                tab[12] = (String) comboBox1.getSelectedItem();
                tab[13] = (String) comboBox3.getSelectedItem();
                tab[14] = loisir;

                RepositoryEtudiant ajouterEtudiant = new RepositoryEtudiant(tab);

                ajouterEtudiant.ajouterEtudiant();

                Table tab1 = new Table();
                tab1.afficherTable();
            }


        });
        quitterButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        resetButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textField1.setText("");
                textField2.setText("");
                dateField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                telephoneField8.setText("");
                textField9.setText("");
                textField13.setText("");
                groupe.clearSelection();
                sportsCheckBox.setSelected(false);
                musiqueCheckBox.setSelected(false);
                voyagesCheckBox.setSelected(false);
                lectureCheckBox.setSelected(false);
                comboBox1.setSelectedIndex(0);
                comboBox2.setSelectedIndex(0);
                comboBox3.setSelectedIndex(0);
                textArea1.setText("");
            }
        });
    }

    public void remplirFiliere(ResultSet resultat) throws SQLException {
        while (resultat.next()) {
            comboBox1.addItem(resultat.getString("nom"));
        }

    }

    public void remplirBac(ResultSet resultat) throws SQLException {
        while (resultat.next()) {
            comboBox3.addItem(resultat.getString("libelle"));
        }

    }

    public JTextField getTextField1() {return textField6;}
    public void afficherContactEtudiant(ResultSet resultFiliere,ResultSet resultBac) throws SQLException {
        remplirFiliere(resultFiliere);
        remplirBac(resultBac);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1010,640);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(PanelContactEtudiant);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
