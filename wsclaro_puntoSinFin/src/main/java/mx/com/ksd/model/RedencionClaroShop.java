//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.11 at 11:14:35 PM CDT 
//


package mx.com.ksd.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for redencionClaroShop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redencionClaroShop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="membernumber" type="{http://www.ksd.com.mx/claroshop}socio"/>
 *         &lt;element name="puntos" type="{http://www.ksd.com.mx/claroshop}puntos"/>
 *         &lt;element name="startdate" type="{http://www.ksd.com.mx/claroshop}fechayHoraDeRedencion"/>
 *         &lt;element name="quantity" type="{http://www.ksd.com.mx/claroshop}cantidad" minOccurs="0"/>
 *         &lt;element name="portalproduct" type="{http://www.ksd.com.mx/claroshop}portal" minOccurs="0"/>
 *         &lt;element name="uniquenumber" type="{http://www.ksd.com.mx/claroshop}nonce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redencionClaroShop", propOrder = {
    "membernumber",
    "puntos",
    "startdate",
    "quantity",
    "portalproduct",
    "uniquenumber"
})
public class RedencionClaroShop {

    protected long membernumber;
    protected long puntos;
    @XmlElement(required = true)
    protected XMLGregorianCalendar startdate;
    protected Long quantity;
    protected String portalproduct;
    protected String uniquenumber;

    /**
     * Gets the value of the membernumber property.
     * 
     */
    public long getMembernumber() {
        return membernumber;
    }

    /**
     * Sets the value of the membernumber property.
     * 
     */
    public void setMembernumber(long value) {
        this.membernumber = value;
    }

    /**
     * Gets the value of the puntos property.
     * 
     */
    public long getPuntos() {
        return puntos;
    }

    /**
     * Sets the value of the puntos property.
     * 
     */
    public void setPuntos(long value) {
        this.puntos = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdate(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the portalproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalproduct() {
        return portalproduct;
    }

    /**
     * Sets the value of the portalproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalproduct(String value) {
        this.portalproduct = value;
    }

    /**
     * Gets the value of the uniquenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquenumber() {
        return uniquenumber;
    }

    /**
     * Sets the value of the uniquenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquenumber(String value) {
        this.uniquenumber = value;
    }

}
