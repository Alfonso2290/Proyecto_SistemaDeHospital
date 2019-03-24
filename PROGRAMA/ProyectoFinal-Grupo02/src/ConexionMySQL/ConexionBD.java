
package conexionmysql;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBD
{
    public Connection on;

    public ConexionBD() {
    }
    
    
    public Connection getConexionBD()
    {
        on=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            on=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }    
        
        return on;
     }   
    
}
