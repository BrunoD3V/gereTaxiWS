/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GereTaxiPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KittenRoullete
 */
public class GereLogins {
    
    public int registarMotorista(String email, String password){
     
        int result = -1;
        try {
            
            Connection connection = GereBD.getConnection();
            
            String query = "INSERT INTO motorista VALUES (null, ?, ?)";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, email);
            ppStmt.setString(2, password);
            ppStmt.executeUpdate();
            
            query = "SELECT * FROM motorista WHERE email = ?";
            
            PreparedStatement ppStmt2 = connection.prepareStatement(query);
            ppStmt2.setString(1, email);
            ResultSet rSet = ppStmt2.executeQuery();
            if(rSet.next())
                result = rSet.getInt("id");
           
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereLogins.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return result;
    }
    
    public int getMotoristaId(String email) {
        int result = -1;
        try{
            Connection connection = GereBD.getConnection();
            
            String query = "SELECT * FROM motorista WHERE email = ?";
            
            PreparedStatement ppStmt2 = connection.prepareStatement(query);
            ppStmt2.setString(1, email);
            ResultSet rSet = ppStmt2.executeQuery();
            if(rSet.next())
                result = rSet.getInt("id");
           
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereLogins.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int checkLogin(String email, String password) {
        
        
        try {
            Connection connection = GereBD.getConnection();
            
            String query = "SELECT * FROM motorista WHERE email = ?";
            
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, email);
            
            ResultSet rSet = ppStmt.executeQuery();
            
            if(rSet.isBeforeFirst()){
                rSet.next();
                
                 if(rSet.getString("password").trim().compareTo(password)==0){
                     
                    return 1;//retorna 1 se as passwords coincidem
                 }
                     
                 else{
                    return 0; // retorna 0 se o mail exist mas as passwords não coincidem
                 }
            } else{
                return -1;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(GereLogins.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
        
    }
    
    
}
