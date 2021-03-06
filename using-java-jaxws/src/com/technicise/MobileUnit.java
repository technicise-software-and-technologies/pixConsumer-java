
package com.technicise;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileUnit">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MOBL"/>
 *     &lt;enumeration value="AMB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileUnit")
@XmlEnum
public enum MobileUnit {

    MOBL,
    AMB;

    public String value() {
        return name();
    }

    public static MobileUnit fromValue(String v) {
        return valueOf(v);
    }

}
