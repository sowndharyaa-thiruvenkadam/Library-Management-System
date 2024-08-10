/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sownd
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn;
    
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Ryaa");
        System.out.println(conn);
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
}
    
}
}
