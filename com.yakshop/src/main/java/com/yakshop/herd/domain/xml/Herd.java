/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */


package com.yakshop.herd.domain.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}labyak" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "labyak"
})
@XmlRootElement(name = "herd")
public class Herd {

    /** The labyak. */
    @XmlElement(required = true)
    protected List<Labyak> labyak;

    /**
     * Gets the value of the labyak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labyak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getLabyak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     * @return the labyak
     * {@link Labyak }
     */
    public List<Labyak> getLabyak() {
        if (labyak == null) {
            labyak = new ArrayList<Labyak>();
        }
        return this.labyak;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Herd [labyak=" + labyak + "]";
	}
    
    

}
