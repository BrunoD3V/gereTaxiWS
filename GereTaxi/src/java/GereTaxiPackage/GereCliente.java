package GereTaxiPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GereCliente {
    
    public boolean inserirCliente(String nome, String morada, String codigoPostal, int nif, int contacto, String email, String tipo, int idMotorista){
        boolean result = false;
        if(this.pesquisarCliente(nome,idMotorista)== null){
            try {
            Connection connection = GereBD.getConnection();
  
            String query = "INSERT INTO cliente VALUES (null, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, nome);
            ppStmt.setString(2, morada);
            ppStmt.setString(3, codigoPostal);
            ppStmt.setInt(4, nif);
            ppStmt.setInt(5, contacto);
            ppStmt.setString(6, email);
            ppStmt.setInt(7, idMotorista);
            ppStmt.setString(8, tipo);
            System.out.println("ANDA ONDE NÂO DEVE");
                        
            ppStmt.executeUpdate();
            
            connection.close();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
        }
        System.out.println("RESULTADO: " + result);
        return result;
    }
    
    public boolean excluirCliente(Cliente cliente){
        try {
            Connection connection = GereBD.getConnection();
  
            String query = "DELETE FROM cliente WHERE nome = ? and idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, cliente.getNome());
            ppStmt.setInt(2, cliente.getIdMotorista());
            ppStmt.executeUpdate();
            
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean excluirCliente(String nomeCliente, int idMotorista){
       return excluirCliente(new Cliente(nomeCliente,idMotorista));
    }
    
    public ArrayList<Cliente> listarClientes(int idMotorista){
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            Connection connection = GereBD.getConnection();
  
            String query = "SELECT * FROM cliente WHERE idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setInt(1,idMotorista);
            ResultSet rSet = ppStmt.executeQuery();
            while(rSet.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(rSet.getInt("id"));
                cliente.setNome(rSet.getString("nome"));
                cliente.setMorada(rSet.getString("morada"));
                cliente.setCodigoPostal(rSet.getString("codigoPostal"));
                cliente.setNif(rSet.getInt("nif"));
                cliente.setContacto(rSet.getInt("contacto"));
                cliente.setEmail(rSet.getString("email"));
                cliente.setTipo(rSet.getString("tipo"));
                cliente.setIdMotorista(rSet.getInt("idMotorista"));
                
                lista.add(cliente);
            }
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    public Cliente pesquisarCliente(String nome, int idMotorista){
        Cliente cliente= null;
        try {
            Connection connection = GereBD.getConnection();
            
            
            String query = "SELECT * FROM cliente WHERE nome = ? and idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, nome);
            ppStmt.setInt(2,idMotorista);
            
            ResultSet rSet = ppStmt.executeQuery();
            if(rSet.next()){
                cliente = new Cliente();
                cliente.setId(rSet.getInt("id"));
                cliente.setNome(rSet.getString("nome"));
                cliente.setMorada(rSet.getString("morada"));
                cliente.setCodigoPostal(rSet.getString("codigoPostal"));
                cliente.setNif(rSet.getInt("nif"));
                cliente.setContacto(rSet.getInt("contacto"));
                cliente.setEmail(rSet.getString("email"));
                cliente.setTipo(rSet.getString("tipo"));
                cliente.setIdMotorista(rSet.getInt("idMotorista"));
            }else{
                return cliente;
            }
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    }
}
