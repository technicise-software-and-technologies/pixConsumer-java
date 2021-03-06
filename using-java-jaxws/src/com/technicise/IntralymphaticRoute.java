
package com.technicise;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntralymphaticRoute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntralymphaticRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ILYMPJINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntralymphaticRoute")
@XmlEnum
public enum IntralymphaticRoute {

    ILYMPJINJ;

    public String value() {
        return name();
    }

    public static IntralymphaticRoute fromValue(String v) {
        return valueOf(v);
    }

}
