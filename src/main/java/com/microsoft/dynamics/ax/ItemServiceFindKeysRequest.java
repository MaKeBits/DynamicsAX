
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria}QueryCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryCriteria"
})
@XmlRootElement(name = "ItemServiceFindKeysRequest", namespace = "http://schemas.microsoft.com/dynamics/2008/01/services")
public class ItemServiceFindKeysRequest {

    @XmlElement(name = "QueryCriteria", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria")
    protected QueryCriteria queryCriteria;

    /**
     * Gets the value of the queryCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCriteria }
     *     
     */
    public QueryCriteria getQueryCriteria() {
        return queryCriteria;
    }

    /**
     * Sets the value of the queryCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCriteria }
     *     
     */
    public void setQueryCriteria(QueryCriteria value) {
        this.queryCriteria = value;
    }

}
