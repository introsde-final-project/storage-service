
package data.server.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DataService", targetNamespace = "http://ws.server.data/", wsdlLocation = "http://127.0.1.1:8005/data?wsdl")
public class DataService
    extends Service
{

    private final static URL DATASERVICE_WSDL_LOCATION;
    private final static WebServiceException DATASERVICE_EXCEPTION;
    private final static QName DATASERVICE_QNAME = new QName("http://ws.server.data/", "DataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.1.1:8005/data?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATASERVICE_WSDL_LOCATION = url;
        DATASERVICE_EXCEPTION = e;
    }

    public DataService() {
        super(__getWsdlLocation(), DATASERVICE_QNAME);
    }

    public DataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATASERVICE_QNAME, features);
    }

    public DataService(URL wsdlLocation) {
        super(wsdlLocation, DATASERVICE_QNAME);
    }

    public DataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATASERVICE_QNAME, features);
    }

    public DataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Data
     */
    @WebEndpoint(name = "DataImplementationPort")
    public Data getDataImplementationPort() {
        return super.getPort(new QName("http://ws.server.data/", "DataImplementationPort"), Data.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Data
     */
    @WebEndpoint(name = "DataImplementationPort")
    public Data getDataImplementationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.server.data/", "DataImplementationPort"), Data.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATASERVICE_EXCEPTION!= null) {
            throw DATASERVICE_EXCEPTION;
        }
        return DATASERVICE_WSDL_LOCATION;
    }

}
