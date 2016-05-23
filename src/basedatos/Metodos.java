/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author migle
 */
public class Metodos {
    
    Connection co = null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            co = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/celpla","root","");
            JOptionPane.showMessageDialog(null, "Se ha establecido conexion");
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se ha establecido conexion");
    }
        return co;
    }
    
    
    
}
