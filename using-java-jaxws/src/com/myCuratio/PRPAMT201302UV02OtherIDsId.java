
package com.myCuratio;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRPA_MT201302UV02.OtherIDs.id complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.OtherIDs.id">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}II">
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.OtherIDs.id.updateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.OtherIDs.id")
public class PRPAMT201302UV02OtherIDsId
    extends II
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;
    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02OtherIDsIdUpdateMode updateMode;

    /**
     * Gets the value of the updateMode property.
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02OtherIDsIdUpdateMode }
     *     
     */
    public PRPAMT201302UV02OtherIDsIdUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Sets the value of the updateMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02OtherIDsIdUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02OtherIDsIdUpdateMode value) {
        this.updateMode = value;
    }

}
