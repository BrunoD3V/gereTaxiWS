package GereTaxiPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSGereTaxi")
public class WSGereTaxi {

////////////GESTÃO DE LOGINS///////////
    @WebMethod(operationName = "registarMotorista")
    public int registarMotorista(@WebParam(name = "email")String email,
            @WebParam(name = "password") String password){
        GereLogins BD = new GereLogins();
        return BD.registarMotorista(email, password);
    }
    
    @WebMethod(operationName = "checkLogin")
    public int checkLogin(@WebParam(name = "email") String email,
            @WebParam(name= "password") String password) {
        GereLogins BD = new GereLogins();
        return BD.checkLogin(email, password);
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMotoristaId")
    public int getMotoristaId(@WebParam(name = "email") String email) {
        GereLogins BD = new GereLogins();
        return BD.getMotoristaId(email);
    }

    
////////////GESTÃO DE SERVIÇOS///////////
    @WebMethod(operationName = "inserirServico")
    public Boolean inserirServico(@WebParam(name = "processo") String processo, 
            @WebParam(name = "nomeCliente") String nomeCliente,
            @WebParam(name = "idMotorista")int idMotorista,
            
            @WebParam(name = "horaDeInicio") String horaDeInicio,
            @WebParam(name = "data") String data,
            @WebParam(name = "origem") String origem,
            @WebParam(name = "destino") String destino,
            @WebParam(name = "trajeto") String trajeto,
            @WebParam(name = "distancia") String distancia,
            @WebParam(name = "horasDeEspera") String horasDeEspera,
            @WebParam(name = "numPassageiros") int numPassageiros,
            @WebParam(name = "custoPortagens") String custoPortagens,
            @WebParam(name = "tipo") String tipo){
        
        GereServico BD = new GereServico();
        return BD.inserirServico(processo, nomeCliente,tipo,horaDeInicio,data,origem,destino,trajeto,distancia,horasDeEspera,numPassageiros,custoPortagens, idMotorista);
    }
    
    @WebMethod(operationName = "pesquisarServicosPorCliente")
    public ArrayList<Servico> pesquisarServicosPorCliente(@WebParam(name = "nomeCliente") String nomeCliente){
        GereServico BD = new GereServico();
        return BD.pesquisarServicosPorCliente(nomeCliente);
    }
    @WebMethod(operationName = "excluirServico")
    public Boolean excluirServico(@WebParam(name = "processo") String processo){
        GereServico BD = new GereServico();
        return BD.excluirServico(processo);
    }
    
    @WebMethod(operationName = "pesquisarServico")
    public Servico pesquisarServico(@WebParam(name = "processo") String processo){
        GereServico BD = new GereServico();
        return BD.pesquisarServico(processo);
    }
    
    @WebMethod(operationName = "listarServicos")
    public ArrayList<Servico> listarServicos(){
        GereServico BD = new GereServico();
        return BD.listarServico();
    }

///////////////GESTÃO DE CLIENTES/////////
     @WebMethod(operationName = "inserirCliente")
    public Boolean inserirCliente(@WebParam(name = "nome") String nome,
            @WebParam(name = "morada") String morada,
            @WebParam(name = "codigoPostal") String codigoPostal,
            @WebParam(name = "nif") int nif,
            @WebParam(name = "contacto") int contacto,
            @WebParam(name = "email") String email,
            @WebParam(name = "tipo") String tipo,
            @WebParam(name = "idMotorista")int idMotorista)
    {
        GereCliente BD = new GereCliente();
        return BD.inserirCliente(nome,morada,codigoPostal,nif,contacto,email,tipo, idMotorista);
    }
    
    @WebMethod(operationName = "excluirCliente")
    public Boolean excluirCliente(@WebParam(name = "nome")String nome){
        GereCliente BD = new GereCliente();
        return BD.excluirCliente(nome);
    }
    
    @WebMethod(operationName = "listarClientes")
    public ArrayList<Cliente> listarClientes(){
        GereCliente BD = new GereCliente();
        return BD.listarClientes();
    }
    
    @WebMethod(operationName = "pesquisarCliente")
    public Cliente pesquisarCliente(@WebParam(name = "nome") String nome){
        GereCliente BD = new GereCliente();
        return BD.pesquisarCliente(nome);
    }

    
}