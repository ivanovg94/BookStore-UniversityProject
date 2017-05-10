
package client;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BooksService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8123/?wsdl")
public class BooksService
    extends Service
{

    private final static URL BOOKSSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKSSERVICE_EXCEPTION;
    private final static QName BOOKSSERVICE_QNAME = new QName("http://tempuri.org/", "BooksService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8123/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSSERVICE_WSDL_LOCATION = url;
        BOOKSSERVICE_EXCEPTION = e;
    }

    public BooksService() {
        super(__getWsdlLocation(), BOOKSSERVICE_QNAME);
    }

    public BooksService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSSERVICE_QNAME, features);
    }

    public BooksService(URL wsdlLocation) {
        super(wsdlLocation, BOOKSSERVICE_QNAME);
    }

    public BooksService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSSERVICE_QNAME, features);
    }

    public BooksService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BooksService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IBooksService
     */
    @WebEndpoint(name = "WSHttpBinding_IBooksService")
    public IBooksService getWSHttpBindingIBooksService() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IBooksService"), IBooksService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBooksService
     */
    @WebEndpoint(name = "WSHttpBinding_IBooksService")
    public IBooksService getWSHttpBindingIBooksService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IBooksService"), IBooksService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSSERVICE_EXCEPTION!= null) {
            throw BOOKSSERVICE_EXCEPTION;
        }
        return BOOKSSERVICE_WSDL_LOCATION;
    }

}
