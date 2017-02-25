
package com.myCuratio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KitEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KitEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIT"/>
 *     &lt;enumeration value="SYSTM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KitEntityType")
@XmlEnum
public enum KitEntityType {

    KIT,
    SYSTM;

    public String value() {
        return name();
    }

    public static KitEntityType fromValue(String v) {
        return valueOf(v);
    }

}
