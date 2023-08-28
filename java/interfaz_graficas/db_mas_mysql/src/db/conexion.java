/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neo
 */
public class conexion {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "xfce";
    private static String URL = "jdbc:mysql://localhost:3306/inventario?useSSL=false";
    
    static{
        
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error "+e);
            
        }
        
    }
    
    public Connection getConnection(){
        Connection con = null;
        try {
            con=DriverManager.getConnection(URL, USUARIO, PASSWORD);
           // JOptionPane.showMessageDialog(null, "EXITO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        return con;
    
    
    
    
}
}