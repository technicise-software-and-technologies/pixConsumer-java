
package com.technicise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COCT_MT510000UV06.Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element name="billableClinicalService1" type="{urn:hl7-org:v3}COCT_MT290000UV06.BillableClinicalService"/>
 *             &lt;element name="billableClinicalProduct1" type="{urn:hl7-org:v3}COCT_MT490000UV04.BillableClinicalProduct"/>
 *             &lt;element name="supplyEvent1" type="{urn:hl7-org:v3}COCT_MT300000UV04.SupplyEvent"/>
 *             &lt;element name="accomodationSupplied1" type="{urn:hl7-org:v3}COCT_MT310000UV04.AccomodationSupplied"/>
 *             &lt;element name="supplyEvent2" type="{urn:hl7-org:v3}COCT_MT600000UV06.SupplyEvent"/>
 *             &lt;element name="oralHealthService1" type="{urn:hl7-org:v3}COCT_MT740000UV04.OralHealthService"/>
 *             &lt;element name="crossReference1" type="{urn:hl7-org:v3}COCT_MT280000UV04.CrossReference"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;choice>
 *               &lt;element name="observation" type="{urn:hl7-org:v3}COCT_MT530000UV.Observation"/>
 *               &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}COCT_MT530000UV.SubstanceAdministration"/>
 *               &lt;element name="supply" type="{urn:hl7-org:v3}COCT_MT530000UV.Supply"/>
 *               &lt;element name="procedure" type="{urn:hl7-org:v3}COCT_MT530000UV.Procedure"/>
 *               &lt;element name="encounter" type="{urn:hl7-org:v3}COCT_MT530000UV.Encounter"/>
 *               &lt;element name="act" type="{urn:hl7-org:v3}COCT_MT530000UV.Act"/>
 *               &lt;element name="organizer" type="{urn:hl7-org:v3}COCT_MT530000UV.Organizer"/>
 *             &lt;/choice>
 *             &lt;element name="actReference" type="{urn:hl7-org:v3}COCT_MT530000UV.ActReference"/>
 *           &lt;/choice>
 *           &lt;element name="transportation" type="{urn:hl7-org:v3}COCT_MT060000UV01.Transportation"/>
 *           &lt;element name="serviceDefinition" type="{urn:hl7-org:v3}COCT_MT510000UV06.ServiceDefinition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ActRelationshipType" fixed="INST" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.Definition", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "billableClinicalService1",
    "billableClinicalProduct1",
    "supplyEvent1",
    "accomodationSupplied1",
    "supplyEvent2",
    "oralHealthService1",
    "crossReference1",
    "observation",
    "substanceAdministration",
    "supply",
    "procedure",
    "encounter",
    "act",
    "organizer",
    "actReference",
    "transportation",
    "serviceDefinition"
})
public class COCTMT510000UV06Definition
    implements Serializable
{

    private final static long serialVersionUID = 20130510160300L;
    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(nillable = true)
    protected COCTMT290000UV06BillableClinicalService billableClinicalService1;
    @XmlElement(nillable = true)
    protected COCTMT490000UV04BillableClinicalProduct billableClinicalProduct1;
    @XmlElement(nillable = true)
    protected COCTMT300000UV04SupplyEvent supplyEvent1;
    @XmlElement(nillable = true)
    protected COCTMT310000UV04AccomodationSupplied accomodationSupplied1;
    @XmlElement(nillable = true)
    protected COCTMT600000UV06SupplyEvent supplyEvent2;
    @XmlElement(nillable = true)
    protected COCTMT740000UV04OralHealthService oralHealthService1;
    @XmlElement(nillable = true)
    protected COCTMT280000UV04CrossReference crossReference1;
    @XmlElement(nillable = true)
    protected COCTMT530000UVObservation observation;
    @XmlElement(nillable = true)
    protected COCTMT530000UVSubstanceAdministration substanceAdministration;
    @XmlElement(nillable = true)
    protected COCTMT530000UVSupply supply;
    @XmlElement(nillable = true)
    protected COCTMT530000UVProcedure procedure;
    @XmlElement(nillable = true)
    protected COCTMT530000UVEncounter encounter;
    @XmlElement(nillable = true)
    protected COCTMT530000UVAct act;
    @XmlElement(nillable = true)
    protected COCTMT530000UVOrganizer organizer;
    @XmlElement(nillable = true)
    protected COCTMT530000UVActReference actReference;
    @XmlElement(nillable = true)
    protected COCTMT060000UV01Transportation transportation;
    @XmlElement(nillable = true)
    protected COCTMT510000UV06ServiceDefinition serviceDefinition;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected List<String> typeCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the billableClinicalService1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT290000UV06BillableClinicalService }
     *     
     */
    public COCTMT290000UV06BillableClinicalService getBillableClinicalService1() {
        return billableClinicalService1;
    }

    /**
     * Sets the value of the billableClinicalService1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT290000UV06BillableClinicalService }
     *     
     */
    public void setBillableClinicalService1(COCTMT290000UV06BillableClinicalService value) {
        this.billableClinicalService1 = value;
    }

    /**
     * Gets the value of the billableClinicalProduct1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT490000UV04BillableClinicalProduct }
     *     
     */
    public COCTMT490000UV04BillableClinicalProduct getBillableClinicalProduct1() {
        return billableClinicalProduct1;
    }

    /**
     * Sets the value of the billableClinicalProduct1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT490000UV04BillableClinicalProduct }
     *     
     */
    public void setBillableClinicalProduct1(COCTMT490000UV04BillableClinicalProduct value) {
        this.billableClinicalProduct1 = value;
    }

    /**
     * Gets the value of the supplyEvent1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT300000UV04SupplyEvent }
     *     
     */
    public COCTMT300000UV04SupplyEvent getSupplyEvent1() {
        return supplyEvent1;
    }

    /**
     * Sets the value of the supplyEvent1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT300000UV04SupplyEvent }
     *     
     */
    public void setSupplyEvent1(COCTMT300000UV04SupplyEvent value) {
        this.supplyEvent1 = value;
    }

    /**
     * Gets the value of the accomodationSupplied1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT310000UV04AccomodationSupplied }
     *     
     */
    public COCTMT310000UV04AccomodationSupplied getAccomodationSupplied1() {
        return accomodationSupplied1;
    }

    /**
     * Sets the value of the accomodationSupplied1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT310000UV04AccomodationSupplied }
     *     
     */
    public void setAccomodationSupplied1(COCTMT310000UV04AccomodationSupplied value) {
        this.accomodationSupplied1 = value;
    }

    /**
     * Gets the value of the supplyEvent2 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT600000UV06SupplyEvent }
     *     
     */
    public COCTMT600000UV06SupplyEvent getSupplyEvent2() {
        return supplyEvent2;
    }

    /**
     * Sets the value of the supplyEvent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT600000UV06SupplyEvent }
     *     
     */
    public void setSupplyEvent2(COCTMT600000UV06SupplyEvent value) {
        this.supplyEvent2 = value;
    }

    /**
     * Gets the value of the oralHealthService1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT740000UV04OralHealthService }
     *     
     */
    public COCTMT740000UV04OralHealthService getOralHealthService1() {
        return oralHealthService1;
    }

    /**
     * Sets the value of the oralHealthService1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT740000UV04OralHealthService }
     *     
     */
    public void setOralHealthService1(COCTMT740000UV04OralHealthService value) {
        this.oralHealthService1 = value;
    }

    /**
     * Gets the value of the crossReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT280000UV04CrossReference }
     *     
     */
    public COCTMT280000UV04CrossReference getCrossReference1() {
        return crossReference1;
    }

    /**
     * Sets the value of the crossReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT280000UV04CrossReference }
     *     
     */
    public void setCrossReference1(COCTMT280000UV04CrossReference value) {
        this.crossReference1 = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVObservation }
     *     
     */
    public COCTMT530000UVObservation getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVObservation }
     *     
     */
    public void setObservation(COCTMT530000UVObservation value) {
        this.observation = value;
    }

    /**
     * Gets the value of the substanceAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVSubstanceAdministration }
     *     
     */
    public COCTMT530000UVSubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Sets the value of the substanceAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVSubstanceAdministration }
     *     
     */
    public void setSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        this.substanceAdministration = value;
    }

    /**
     * Gets the value of the supply property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVSupply }
     *     
     */
    public COCTMT530000UVSupply getSupply() {
        return supply;
    }

    /**
     * Sets the value of the supply property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVSupply }
     *     
     */
    public void setSupply(COCTMT530000UVSupply value) {
        this.supply = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVProcedure }
     *     
     */
    public COCTMT530000UVProcedure getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVProcedure }
     *     
     */
    public void setProcedure(COCTMT530000UVProcedure value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVEncounter }
     *     
     */
    public COCTMT530000UVEncounter getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVEncounter }
     *     
     */
    public void setEncounter(COCTMT530000UVEncounter value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVAct }
     *     
     */
    public COCTMT530000UVAct getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVAct }
     *     
     */
    public void setAct(COCTMT530000UVAct value) {
        this.act = value;
    }

    /**
     * Gets the value of the organizer property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVOrganizer }
     *     
     */
    public COCTMT530000UVOrganizer getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVOrganizer }
     *     
     */
    public void setOrganizer(COCTMT530000UVOrganizer value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the actReference property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT530000UVActReference }
     *     
     */
    public COCTMT530000UVActReference getActReference() {
        return actReference;
    }

    /**
     * Sets the value of the actReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT530000UVActReference }
     *     
     */
    public void setActReference(COCTMT530000UVActReference value) {
        this.actReference = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT060000UV01Transportation }
     *     
     */
    public COCTMT060000UV01Transportation getTransportation() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT060000UV01Transportation }
     *     
     */
    public void setTransportation(COCTMT060000UV01Transportation value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the serviceDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT510000UV06ServiceDefinition }
     *     
     */
    public COCTMT510000UV06ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    /**
     * Sets the value of the serviceDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT510000UV06ServiceDefinition }
     *     
     */
    public void setServiceDefinition(COCTMT510000UV06ServiceDefinition value) {
        this.serviceDefinition = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

}
