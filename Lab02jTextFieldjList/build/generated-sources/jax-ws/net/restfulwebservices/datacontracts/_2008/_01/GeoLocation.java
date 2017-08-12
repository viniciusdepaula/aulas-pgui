
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GeoLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeoLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISOCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocation", propOrder = {
    "registry",
    "assigned",
    "countryCode",
    "isoCountryCode",
    "country"
})
public class GeoLocation {

    @XmlElementRef(name = "Registry", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registry;
    @XmlElementRef(name = "Assigned", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assigned;
    @XmlElementRef(name = "CountryCode", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "ISOCountryCode", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isoCountryCode;
    @XmlElementRef(name = "Country", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;

    /**
     * Obtém o valor da propriedade registry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistry() {
        return registry;
    }

    /**
     * Define o valor da propriedade registry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistry(JAXBElement<String> value) {
        this.registry = value;
    }

    /**
     * Obtém o valor da propriedade assigned.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssigned() {
        return assigned;
    }

    /**
     * Define o valor da propriedade assigned.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssigned(JAXBElement<String> value) {
        this.assigned = value;
    }

    /**
     * Obtém o valor da propriedade countryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Define o valor da propriedade countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Obtém o valor da propriedade isoCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISOCountryCode() {
        return isoCountryCode;
    }

    /**
     * Define o valor da propriedade isoCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISOCountryCode(JAXBElement<String> value) {
        this.isoCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

}
