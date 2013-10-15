
package com.microsoft.dynamics.ax;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-11T09:57:33.880-03:00
 * Generated source version: 2.7.6
 */

@WebFault(name = "AifFault", targetNamespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault")
public class ItemServiceReadAifFaultFaultFaultMessage extends Exception {
    
    private com.microsoft.dynamics.ax.AifFault aifFault;

    public ItemServiceReadAifFaultFaultFaultMessage() {
        super();
    }
    
    public ItemServiceReadAifFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ItemServiceReadAifFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemServiceReadAifFaultFaultFaultMessage(String message, com.microsoft.dynamics.ax.AifFault aifFault) {
        super(message);
        this.aifFault = aifFault;
    }

    public ItemServiceReadAifFaultFaultFaultMessage(String message, com.microsoft.dynamics.ax.AifFault aifFault, Throwable cause) {
        super(message, cause);
        this.aifFault = aifFault;
    }

    public com.microsoft.dynamics.ax.AifFault getFaultInfo() {
        return this.aifFault;
    }
}
