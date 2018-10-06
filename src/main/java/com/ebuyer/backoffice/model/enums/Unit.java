package com.ebuyer.backoffice.model.enums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="unit")
public enum Unit {
	PERCENTAGE("P");
	
	@Id
	private long id;
	
	@Column(name="value")
	private final String value;
	
	Unit(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
