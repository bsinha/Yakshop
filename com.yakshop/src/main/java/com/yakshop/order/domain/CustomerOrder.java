/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.order.domain;

/**
 * @author bsinha
 *
 */
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * The Class CustomerOrder.
 */
@JsonPropertyOrder({ "customer", "order" })
public class CustomerOrder {

	/** The customer. */
	@JsonProperty("customer")
	private String customer;
	
	/** The order. */
	@JsonProperty("order")
	@Valid
	private Order order;
	
	/** The additional properties. */
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	@JsonProperty("customer")
	public String getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	@JsonProperty("customer")
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	@JsonProperty("order")
	public Order getOrder() {
		return order;
	}

	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	@JsonProperty("order")
	public void setOrder(Order order) {
		this.order = order;
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
