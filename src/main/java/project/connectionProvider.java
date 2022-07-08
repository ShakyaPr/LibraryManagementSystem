/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author praja
 */
public class connectionProvider {

    
 // private static connectionProvider conObj;
    private static Connection con = null;
//    private connectionProvider(){
//       System.out.println("Hello");
//       con = createConnection();
//    }
//    public Connection createConnection(){
    static{
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "lms";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "admin12#$";
        //Connection connection = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url + dbName,username,password);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return connection;      
    }
        public static Connection getInstance(){
//        if (conObj == null){
//            conObj = new connectionProvider();
//        }
        return con;
    }
}
    
//    public static Connection getCon(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","admin12#$");
//            return con;
//        }
//        catch(Exception e){
//            System.out.println(e);
//            return null;
//        }
//    }
//}
