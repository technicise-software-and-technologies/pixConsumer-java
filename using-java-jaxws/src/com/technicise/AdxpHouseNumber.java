
package com.technicise;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adxp.houseNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adxp.houseNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ADXP">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" fixed="BNR" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adxp.houseNumber")
public class AdxpHouseNumber
    extends ADXP
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;

}
