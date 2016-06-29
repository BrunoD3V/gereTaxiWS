package GereTaxiPackage;

public class Servico {
    
    private int id;
    private String processo;
    private String nomeCliente; 
    private String tipo;
    private String horaDeInicio;
    private String data;
    private String origem;
    private String destino;
    private String trajeto;
    private String distancia;
    private String horasDeEspera;
    private int numPassageiros;
    private String custoPortagens;
    private int idMotorista;

    public Servico(String processo) {
        this.processo = processo;
    }

    public Servico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getHorasDeEspera() {
        return horasDeEspera;
    }

    public void setHorasDeEspera(String horasDeEspera) {
        this.horasDeEspera = horasDeEspera;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String getCustoPortagens() {
        return custoPortagens;
    }

    public void setCustoPortagens(String custoPortagens) {
        this.custoPortagens = custoPortagens;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }
    
    
}
