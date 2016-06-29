package GereTaxiPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GereBD {
    
    private static final String URL = "jdbc:mysql://localhost/bdtaxi";
    private static final String USR = "root";
    private static final String PASS = "";
    
    
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Erro no Driver");
        }
        
        return DriverManager.getConnection(URL, USR, PASS);
    }
}
