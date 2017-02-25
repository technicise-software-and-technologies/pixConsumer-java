
package com.myCuratio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HemClinPracticeSetting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HemClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HEM"/>
 *     &lt;enumeration value="PEDHEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HemClinPracticeSetting")
@XmlEnum
public enum HemClinPracticeSetting {

    HEM,
    PEDHEM;

    public String value() {
        return name();
    }

    public static HemClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
