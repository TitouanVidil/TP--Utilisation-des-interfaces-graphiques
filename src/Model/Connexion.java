package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connexion
{
    public static Connection getConnexion()
    {
        String url = "jdbc:mysql://localhost:3306/tp_interface";
        Properties props = new Properties();
        props.setProperty("user","root");
        props.setProperty("password","");

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }

        Connection con = null;

        try
        {
            con = DriverManager.getConnection(url,props);
        }
        catch(SQLException e)
        {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }

        return con;
    }

}
