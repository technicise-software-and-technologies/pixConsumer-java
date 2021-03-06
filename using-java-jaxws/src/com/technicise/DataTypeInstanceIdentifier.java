
package com.technicise;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTypeInstanceIdentifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeInstanceIdentifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="II"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeInstanceIdentifier")
@XmlEnum
public enum DataTypeInstanceIdentifier {

    II;

    public String value() {
        return name();
    }

    public static DataTypeInstanceIdentifier fromValue(String v) {
        return valueOf(v);
    }

}
