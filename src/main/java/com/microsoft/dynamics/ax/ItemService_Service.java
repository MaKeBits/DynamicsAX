package com.microsoft.dynamics.ax;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-11T09:57:33.963-03:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "ItemService", 
                  wsdlLocation = "ItemWDSL.xml",
                  targetNamespace = "http://schemas.microsoft.com/dynamics/2008/01/services") 
public class ItemService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/dynamics/2008/01/services", "ItemService");
    public final static QName BasicHttpBindingItemService = new QName("http://schemas.microsoft.com/dynamics/2008/01/services", "BasicHttpBinding_ItemService");
    static {
        URL url = ItemService_Service.class.getResource("ItemWDSL.xml");
        if (url == null) {
            url = ItemService_Service.class.getClassLoader().getResource("ItemWDSL.xml");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(ItemService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "ItemWDSL.xml");
        }       
        WSDL_LOCATION = url;
    }

    public ItemService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ItemService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ItemService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ItemService
     */
    @WebEndpoint(name = "BasicHttpBinding_ItemService")
    public ItemService getBasicHttpBindingItemService() {
        return super.getPort(BasicHttpBindingItemService, ItemService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItemService
     */
    @WebEndpoint(name = "BasicHttpBinding_ItemService")
    public ItemService getBasicHttpBindingItemService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingItemService, ItemService.class, features);
    }

}
