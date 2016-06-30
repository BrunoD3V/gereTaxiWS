package GereTaxiPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GereServico {
    
    public boolean inserirServico(String processo, String nomeCliente, String tipo, String horaDeInicio, 
            String data, String origem, String destino, String trajeto, String distancia,
            String horasDeEspera,int numPassageiros, String custoPortagens, int idMotorista){
        
        if(this.pesquisarServico(processo,idMotorista)==null){
            try {
            Connection connection = GereBD.getConnection();
  
            String query = "INSERT INTO servico VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ppStmt = connection.prepareStatement(query);
            
            ppStmt.setString(1, processo);
            ppStmt.setString(2, nomeCliente);
            ppStmt.setString(3, tipo);
            ppStmt.setString(4, horaDeInicio);
            ppStmt.setString(5, data);
            ppStmt.setString(6, origem);
            ppStmt.setString(7, destino);
            ppStmt.setString(8, trajeto);
            ppStmt.setString(9, distancia);
            ppStmt.setString(10, horasDeEspera);
            ppStmt.setInt(11, numPassageiros);
            ppStmt.setString(12, custoPortagens);
            ppStmt.setInt(13, idMotorista);
              
            ppStmt.executeUpdate();
            
            connection.close();
            } catch (SQLException ex) {
            Logger.getLogger(GereServico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            }
        }
        return true;
        
    }
    
    public ArrayList<Servico> listarServico(int idMotorista){
        ArrayList<Servico> lista = new ArrayList<>();
        try {
            Connection connection = GereBD.getConnection();
  
            String query = "SELECT * FROM servico WHERE idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setInt(1, idMotorista);
            
            ResultSet rSet = ppStmt.executeQuery();
            while(rSet.next()){
                Servico servico = new Servico();
                
                servico.setId(rSet.getInt("id"));
                servico.setProcesso(rSet.getString("processo"));
                servico.setNomeCliente(rSet.getString("nomeCliente"));
                servico.setTipo(rSet.getString("tipo"));
                servico.setHoraDeInicio(rSet.getString("horaDeInicio"));
                servico.setData(rSet.getString("data"));
                servico.setOrigem(rSet.getString("origem"));
                servico.setDestino(rSet.getString("destino"));
                servico.setTrajeto(rSet.getString("trajeto"));
                servico.setDistancia(rSet.getString("distancia"));
                servico.setHorasDeEspera(rSet.getString("horasDeEspera"));
                servico.setNumPassageiros(rSet.getInt("numPassageiros"));
                servico.setCustoPortagens(rSet.getString("custoPortagens"));
                servico.setIdMotorista(rSet.getInt("idMotorista"));
                
                lista.add(servico);
            }
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
    public boolean excluirServico(Servico servico){
       try {
            Connection connection = GereBD.getConnection();
  
            String query = "DELETE FROM servico WHERE processo = ? and idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, servico.getProcesso());
            ppStmt.setInt(2, servico.getIdMotorista());
            ppStmt.executeUpdate();
            
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereServico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean excluirServico(String processo, int idMotorista){
       return excluirServico(new Servico(processo,idMotorista));
    }
    
 
    public Servico pesquisarServico(String processo, int idMotorista){
        Servico servico = null;
         try {
            Connection connection = GereBD.getConnection();
  
            String query = "SELECT * FROM servico WHERE processo = ? and idMotorista = ?";
            PreparedStatement ppStmt = connection.prepareStatement(query);
            ppStmt.setString(1, processo);
            ppStmt.setInt(2, idMotorista);
            
            ResultSet rSet = ppStmt.executeQuery();
            if(rSet.next()){
                servico = new Servico();
                
                servico.setId(rSet.getInt("id"));
                servico.setProcesso(rSet.getString("processo"));
                servico.setNomeCliente(rSet.getString("nomeCliente"));
                servico.setTipo(rSet.getString("tipo"));
                servico.setHoraDeInicio(rSet.getString("horaDeInicio"));
                servico.setData(rSet.getString("data"));
                servico.setOrigem(rSet.getString("origem"));
                servico.setDestino(rSet.getString("destino"));
                servico.setTrajeto(rSet.getString("trajeto"));
                servico.setDistancia(rSet.getString("distancia"));
                servico.setHorasDeEspera(rSet.getString("horasDeEspera"));
                servico.setNumPassageiros(rSet.getInt("numPassageiros"));
                servico.setCustoPortagens(rSet.getString("custoPortagens"));
                servico.setIdMotorista(rSet.getInt("idMotorista"));
                
            }else{
                return servico;
            }
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return servico;
    }
    public ArrayList<Servico> pesquisarServicosPorCliente(String nomeCliente, int idMotorista){
        ArrayList<Servico> lista = new ArrayList<>();
        try {
            Connection connection = GereBD.getConnection();
            
            String query = "SELECT * FROM servico WHERE nomeCliente = ? and idMotorista = ?";
            
            PreparedStatement ppStmt = connection.prepareStatement(query);
            
            ppStmt.setString(1, nomeCliente);
            ppStmt.setInt(2, idMotorista);
            
            ResultSet rSet = ppStmt.executeQuery();
            while(rSet.next()){
                Servico servico = new Servico();
                
                servico.setId(rSet.getInt("id"));
                servico.setProcesso(rSet.getString("processo"));
                servico.setNomeCliente(rSet.getString("nomeCliente"));
                servico.setTipo(rSet.getString("tipo"));
                servico.setHoraDeInicio(rSet.getString("horaDeInicio"));
                servico.setData(rSet.getString("data"));
                servico.setOrigem(rSet.getString("origem"));
                servico.setDestino(rSet.getString("destino"));
                servico.setTrajeto(rSet.getString("trajeto"));
                servico.setDistancia(rSet.getString("distancia"));
                servico.setHorasDeEspera(rSet.getString("horasDeEspera"));
                servico.setNumPassageiros(rSet.getInt("numPassageiros"));
                servico.setCustoPortagens(rSet.getString("custoPortagens"));
                servico.setIdMotorista(rSet.getInt("idMotorista"));
                
                lista.add(servico);
            }
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(GereCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
}
