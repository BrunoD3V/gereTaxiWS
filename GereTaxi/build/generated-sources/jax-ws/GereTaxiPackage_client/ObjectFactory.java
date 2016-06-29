
package GereTaxiPackage_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the GereTaxiPackage_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckLogin_QNAME = new QName("http://GereTaxiPackage/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://GereTaxiPackage/", "checkLoginResponse");
    private final static QName _ExcluirCliente_QNAME = new QName("http://GereTaxiPackage/", "excluirCliente");
    private final static QName _ExcluirClienteResponse_QNAME = new QName("http://GereTaxiPackage/", "excluirClienteResponse");
    private final static QName _ExcluirServico_QNAME = new QName("http://GereTaxiPackage/", "excluirServico");
    private final static QName _ExcluirServicoResponse_QNAME = new QName("http://GereTaxiPackage/", "excluirServicoResponse");
    private final static QName _InserirCliente_QNAME = new QName("http://GereTaxiPackage/", "inserirCliente");
    private final static QName _InserirClienteResponse_QNAME = new QName("http://GereTaxiPackage/", "inserirClienteResponse");
    private final static QName _InserirServico_QNAME = new QName("http://GereTaxiPackage/", "inserirServico");
    private final static QName _InserirServicoResponse_QNAME = new QName("http://GereTaxiPackage/", "inserirServicoResponse");
    private final static QName _ListarClientes_QNAME = new QName("http://GereTaxiPackage/", "listarClientes");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://GereTaxiPackage/", "listarClientesResponse");
    private final static QName _ListarServicos_QNAME = new QName("http://GereTaxiPackage/", "listarServicos");
    private final static QName _ListarServicosResponse_QNAME = new QName("http://GereTaxiPackage/", "listarServicosResponse");
    private final static QName _PesquisarCliente_QNAME = new QName("http://GereTaxiPackage/", "pesquisarCliente");
    private final static QName _PesquisarClienteResponse_QNAME = new QName("http://GereTaxiPackage/", "pesquisarClienteResponse");
    private final static QName _PesquisarServico_QNAME = new QName("http://GereTaxiPackage/", "pesquisarServico");
    private final static QName _PesquisarServicoResponse_QNAME = new QName("http://GereTaxiPackage/", "pesquisarServicoResponse");
    private final static QName _RegistarMotorista_QNAME = new QName("http://GereTaxiPackage/", "registarMotorista");
    private final static QName _RegistarMotoristaResponse_QNAME = new QName("http://GereTaxiPackage/", "registarMotoristaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: GereTaxiPackage_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link ExcluirCliente }
     * 
     */
    public ExcluirCliente createExcluirCliente() {
        return new ExcluirCliente();
    }

    /**
     * Create an instance of {@link ExcluirClienteResponse }
     * 
     */
    public ExcluirClienteResponse createExcluirClienteResponse() {
        return new ExcluirClienteResponse();
    }

    /**
     * Create an instance of {@link ExcluirServico }
     * 
     */
    public ExcluirServico createExcluirServico() {
        return new ExcluirServico();
    }

    /**
     * Create an instance of {@link ExcluirServicoResponse }
     * 
     */
    public ExcluirServicoResponse createExcluirServicoResponse() {
        return new ExcluirServicoResponse();
    }

    /**
     * Create an instance of {@link InserirCliente }
     * 
     */
    public InserirCliente createInserirCliente() {
        return new InserirCliente();
    }

    /**
     * Create an instance of {@link InserirClienteResponse }
     * 
     */
    public InserirClienteResponse createInserirClienteResponse() {
        return new InserirClienteResponse();
    }

    /**
     * Create an instance of {@link InserirServico }
     * 
     */
    public InserirServico createInserirServico() {
        return new InserirServico();
    }

    /**
     * Create an instance of {@link InserirServicoResponse }
     * 
     */
    public InserirServicoResponse createInserirServicoResponse() {
        return new InserirServicoResponse();
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link ListarServicos }
     * 
     */
    public ListarServicos createListarServicos() {
        return new ListarServicos();
    }

    /**
     * Create an instance of {@link ListarServicosResponse }
     * 
     */
    public ListarServicosResponse createListarServicosResponse() {
        return new ListarServicosResponse();
    }

    /**
     * Create an instance of {@link PesquisarCliente }
     * 
     */
    public PesquisarCliente createPesquisarCliente() {
        return new PesquisarCliente();
    }

    /**
     * Create an instance of {@link PesquisarClienteResponse }
     * 
     */
    public PesquisarClienteResponse createPesquisarClienteResponse() {
        return new PesquisarClienteResponse();
    }

    /**
     * Create an instance of {@link PesquisarServico }
     * 
     */
    public PesquisarServico createPesquisarServico() {
        return new PesquisarServico();
    }

    /**
     * Create an instance of {@link PesquisarServicoResponse }
     * 
     */
    public PesquisarServicoResponse createPesquisarServicoResponse() {
        return new PesquisarServicoResponse();
    }

    /**
     * Create an instance of {@link RegistarMotorista }
     * 
     */
    public RegistarMotorista createRegistarMotorista() {
        return new RegistarMotorista();
    }

    /**
     * Create an instance of {@link RegistarMotoristaResponse }
     * 
     */
    public RegistarMotoristaResponse createRegistarMotoristaResponse() {
        return new RegistarMotoristaResponse();
    }

    /**
     * Create an instance of {@link Servico }
     * 
     */
    public Servico createServico() {
        return new Servico();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "excluirCliente")
    public JAXBElement<ExcluirCliente> createExcluirCliente(ExcluirCliente value) {
        return new JAXBElement<ExcluirCliente>(_ExcluirCliente_QNAME, ExcluirCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "excluirClienteResponse")
    public JAXBElement<ExcluirClienteResponse> createExcluirClienteResponse(ExcluirClienteResponse value) {
        return new JAXBElement<ExcluirClienteResponse>(_ExcluirClienteResponse_QNAME, ExcluirClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirServico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "excluirServico")
    public JAXBElement<ExcluirServico> createExcluirServico(ExcluirServico value) {
        return new JAXBElement<ExcluirServico>(_ExcluirServico_QNAME, ExcluirServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirServicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "excluirServicoResponse")
    public JAXBElement<ExcluirServicoResponse> createExcluirServicoResponse(ExcluirServicoResponse value) {
        return new JAXBElement<ExcluirServicoResponse>(_ExcluirServicoResponse_QNAME, ExcluirServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "inserirCliente")
    public JAXBElement<InserirCliente> createInserirCliente(InserirCliente value) {
        return new JAXBElement<InserirCliente>(_InserirCliente_QNAME, InserirCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "inserirClienteResponse")
    public JAXBElement<InserirClienteResponse> createInserirClienteResponse(InserirClienteResponse value) {
        return new JAXBElement<InserirClienteResponse>(_InserirClienteResponse_QNAME, InserirClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirServico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "inserirServico")
    public JAXBElement<InserirServico> createInserirServico(InserirServico value) {
        return new JAXBElement<InserirServico>(_InserirServico_QNAME, InserirServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirServicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "inserirServicoResponse")
    public JAXBElement<InserirServicoResponse> createInserirServicoResponse(InserirServicoResponse value) {
        return new JAXBElement<InserirServicoResponse>(_InserirServicoResponse_QNAME, InserirServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarServicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "listarServicos")
    public JAXBElement<ListarServicos> createListarServicos(ListarServicos value) {
        return new JAXBElement<ListarServicos>(_ListarServicos_QNAME, ListarServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarServicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "listarServicosResponse")
    public JAXBElement<ListarServicosResponse> createListarServicosResponse(ListarServicosResponse value) {
        return new JAXBElement<ListarServicosResponse>(_ListarServicosResponse_QNAME, ListarServicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "pesquisarCliente")
    public JAXBElement<PesquisarCliente> createPesquisarCliente(PesquisarCliente value) {
        return new JAXBElement<PesquisarCliente>(_PesquisarCliente_QNAME, PesquisarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "pesquisarClienteResponse")
    public JAXBElement<PesquisarClienteResponse> createPesquisarClienteResponse(PesquisarClienteResponse value) {
        return new JAXBElement<PesquisarClienteResponse>(_PesquisarClienteResponse_QNAME, PesquisarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarServico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "pesquisarServico")
    public JAXBElement<PesquisarServico> createPesquisarServico(PesquisarServico value) {
        return new JAXBElement<PesquisarServico>(_PesquisarServico_QNAME, PesquisarServico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarServicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "pesquisarServicoResponse")
    public JAXBElement<PesquisarServicoResponse> createPesquisarServicoResponse(PesquisarServicoResponse value) {
        return new JAXBElement<PesquisarServicoResponse>(_PesquisarServicoResponse_QNAME, PesquisarServicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarMotorista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "registarMotorista")
    public JAXBElement<RegistarMotorista> createRegistarMotorista(RegistarMotorista value) {
        return new JAXBElement<RegistarMotorista>(_RegistarMotorista_QNAME, RegistarMotorista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarMotoristaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GereTaxiPackage/", name = "registarMotoristaResponse")
    public JAXBElement<RegistarMotoristaResponse> createRegistarMotoristaResponse(RegistarMotoristaResponse value) {
        return new JAXBElement<RegistarMotoristaResponse>(_RegistarMotoristaResponse_QNAME, RegistarMotoristaResponse.class, null, value);
    }

}
