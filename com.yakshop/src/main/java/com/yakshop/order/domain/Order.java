/**
 * (C) Copyright � 1999- 2014. All rights reserved.
 */
package com.yakshop.order.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * The Class Order.
 */
@JsonPropertyOrder({ "milk", "skins" })
public class Order {

	/** The milk. */
	@JsonProperty("milk")
	private Integer milk;
	
	/** The skins. */
	@JsonProperty("skins")
	private Integer skins;
	
	/** The additional properties. */
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the milk.
	 *
	 * @return the milk
	 */
	@JsonProperty("milk")
	public Integer getMilk() {
		return milk;
	}

	/**
	 * Sets the milk.
	 *
	 * @param milk the new milk
	 */
	@JsonProperty("milk")
	public void setMilk(Integer milk) {
		this.milk = milk;
	}

	/**
	 * Gets the skins.
	 *
	 * @return the skins
	 */
	@JsonProperty("skins")
	public Integer getSkins() {
		return skins;
	}

	/**
	 * Sets the skins.
	 *
	 * @param skins the new skins
	 */
	@JsonProperty("skins")
	public void setSkins(Integer skins) {
		this.skins = skins;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}

	/**
	 * Gets the additional properties.
	 *
	 * @return the additional properties
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Sets the additional properties.
	 *
	 * @param name the name
	 * @param value the value
	 */
	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
