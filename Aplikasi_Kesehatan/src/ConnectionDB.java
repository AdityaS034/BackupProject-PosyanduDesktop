/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.awt.HeadlessException;
/**
 *
 * @author ASUS
 */
public class ConnectionDB {
    static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/pbo_aplikasi_kesehatan";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        }catch(ClassNotFoundException cnf){
            
        }try{
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi database berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database");
        }catch(HeadlessException e){
            
        }
        return conn;
    }
}
