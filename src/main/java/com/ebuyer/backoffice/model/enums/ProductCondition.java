package com.ebuyer.backoffice.model.enums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="product_condition")
public enum ProductCondition {
	NEW("new"), USED("used");
	
	@Id
	private long id;
	
	@Column(name="value")
	private final String value;
	
	ProductCondition(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
