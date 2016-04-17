/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.common.model;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public class SearchCriteria {

	private String key;

	private Object value;

	private String operator;

	public SearchCriteria() {
		super();
	}

	/**
	 * @param key
	 * @param value
	 * @param operator
	 */
	public SearchCriteria(String key, Object value, String operator) {
		super();
		this.key = key;
		this.value = value;
		this.operator = operator;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
