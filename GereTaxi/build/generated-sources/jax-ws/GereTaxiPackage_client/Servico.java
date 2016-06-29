
package GereTaxiPackage_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custoPortagens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaDeInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horasDeEspera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomeCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPassageiros" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trajeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servico", propOrder = {
    "custoPortagens",
    "data",
    "destino",
    "distancia",
    "horaDeInicio",
    "horasDeEspera",
    "id",
    "nomeCliente",
    "numPassageiros",
    "origem",
    "processo",
    "tipo",
    "trajeto"
})
public class Servico {

    protected String custoPortagens;
    protected String data;
    protected String destino;
    protected String distancia;
    protected String horaDeInicio;
    protected String horasDeEspera;
    protected int id;
    protected String nomeCliente;
    protected int numPassageiros;
    protected String origem;
    protected String processo;
    protected String tipo;
    protected String trajeto;

    /**
     * Gets the value of the custoPortagens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustoPortagens() {
        return custoPortagens;
    }

    /**
     * Sets the value of the custoPortagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustoPortagens(String value) {
        this.custoPortagens = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Gets the value of the distancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistancia(String value) {
        this.distancia = value;
    }

    /**
     * Gets the value of the horaDeInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    /**
     * Sets the value of the horaDeInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraDeInicio(String value) {
        this.horaDeInicio = value;
    }

    /**
     * Gets the value of the horasDeEspera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorasDeEspera() {
        return horasDeEspera;
    }

    /**
     * Sets the value of the horasDeEspera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorasDeEspera(String value) {
        this.horasDeEspera = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nomeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets the value of the nomeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Gets the value of the numPassageiros property.
     * 
     */
    public int getNumPassageiros() {
        return numPassageiros;
    }

    /**
     * Sets the value of the numPassageiros property.
     * 
     */
    public void setNumPassageiros(int value) {
        this.numPassageiros = value;
    }

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Gets the value of the processo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesso() {
        return processo;
    }

    /**
     * Sets the value of the processo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesso(String value) {
        this.processo = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the trajeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrajeto() {
        return trajeto;
    }

    /**
     * Sets the value of the trajeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrajeto(String value) {
        this.trajeto = value;
    }

}
