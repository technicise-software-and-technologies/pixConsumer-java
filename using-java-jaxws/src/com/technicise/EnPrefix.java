
package com.technicise;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for en.prefix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="en.prefix">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ENXP">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}EntityNamePartType" fixed="PFX" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "en.prefix")
public class EnPrefix
    extends ENXP
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;

}