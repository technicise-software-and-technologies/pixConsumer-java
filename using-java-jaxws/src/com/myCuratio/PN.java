
package com.myCuratio;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A name for a person. A sequence of name parts, such as
 *                 given name or family name, prefix, suffix, etc. PN differs
 *                 from EN because the qualifier type cannot include LS
 *                 (Legal Status).
 *             
 * 
 * <p>Java class for PN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}EN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PN")
public class PN
    extends EN
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;

}