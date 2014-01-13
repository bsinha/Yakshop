/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.herd.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * The Class Herd.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "name", "age", "age-last-shaved" })
public class Herd {

	/** The name. */
	@JsonProperty("name")
	private String name;
	
	/** The age. */
	@JsonProperty("age")
	private Double age;
	
	/** The age_last_shaved. */
	@JsonProperty("age-last-shaved")
	private Double age_last_shaved;
	
	/** The additional properties. */
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Instantiates a new herd.
	 */
	public Herd() {
		super();
	}
	
	/**
	 * Instantiates a new herd.
	 *
	 * @param name the name
	 * @param age the age
	 * @param age_last_shaved the age_last_shaved
	 */
	public Herd(String name, Double age, Double age_last_shaved) {
		super();
		this.name = name;
		this.age = age;
		this.age_last_shaved = age_last_shaved;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	@JsonProperty("age")
	public Double getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	@JsonProperty("age")
	public void setAge(Double age) {
		this.age = age;
	}

	/**
	 * Gets the age_last_shaved.
	 *
	 * @return the age_last_shaved
	 */
	@JsonProperty("age-last-shaved")
	public Double getAge_last_shaved() {
		return age_last_shaved;
	}

	/**
	 * Sets the age_last_shaved.
	 *
	 * @param age_last_shaved the new age_last_shaved
	 */
	@JsonProperty("age-last-shaved")
	public void setAge_last_shaved(Double age_last_shaved) {
		this.age_last_shaved = age_last_shaved;
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
