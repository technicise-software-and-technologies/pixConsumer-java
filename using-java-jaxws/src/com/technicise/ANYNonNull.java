
package com.technicise;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The BooleanNonNull type is used where a Boolean cannot
 *                 have a null value. A Boolean value can be either
 *                 true or false.
 *             
 * 
 * <p>Java class for ANYNonNull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANYNonNull">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}ANY">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANYNonNull")
@XmlSeeAlso({
    BN.class
})
public class ANYNonNull
    extends ANY
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;

}
