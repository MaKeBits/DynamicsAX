
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_PBAItemAutoGenerated.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_PBAItemAutoGenerated">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_PBAItemAutoGenerated")
@XmlEnum
public enum AxdExtTypePBAItemAutoGenerated {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    AxdExtTypePBAItemAutoGenerated(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypePBAItemAutoGenerated fromValue(String v) {
        for (AxdExtTypePBAItemAutoGenerated c: AxdExtTypePBAItemAutoGenerated.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
