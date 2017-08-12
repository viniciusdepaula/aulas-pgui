
package net.restfulwebservices.servicecontracts._2008._01;

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
@WebServiceClient(name = "GeoIPService", targetNamespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", wsdlLocation = "http://www.restfulwebservices.net/wcf/GeoIPService.svc?wsdl")
public class GeoIPService
    extends Service
{

    private final static URL GEOIPSERVICE_WSDL_LOCATION;
    private final static WebServiceException GEOIPSERVICE_EXCEPTION;
    private final static QName GEOIPSERVICE_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GeoIPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.restfulwebservices.net/wcf/GeoIPService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GEOIPSERVICE_WSDL_LOCATION = url;
        GEOIPSERVICE_EXCEPTION = e;
    }

    public GeoIPService() {
        super(__getWsdlLocation(), GEOIPSERVICE_QNAME);
    }

    public GeoIPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GEOIPSERVICE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation) {
        super(wsdlLocation, GEOIPSERVICE_QNAME);
    }

    public GeoIPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GEOIPSERVICE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IGeoIPService
     */
    @WebEndpoint(name = "BasicHttpBinding_IGeoIPService")
    public IGeoIPService getBasicHttpBindingIGeoIPService() {
        return super.getPort(new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "BasicHttpBinding_IGeoIPService"), IGeoIPService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IGeoIPService
     */
    @WebEndpoint(name = "BasicHttpBinding_IGeoIPService")
    public IGeoIPService getBasicHttpBindingIGeoIPService(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "BasicHttpBinding_IGeoIPService"), IGeoIPService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GEOIPSERVICE_EXCEPTION!= null) {
            throw GEOIPSERVICE_EXCEPTION;
        }
        return GEOIPSERVICE_WSDL_LOCATION;
    }

}