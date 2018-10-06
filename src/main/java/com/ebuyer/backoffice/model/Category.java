package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="category")
@Data
public class Category {
	@Id
	private long id;
	
	@Column (name="name")
	private String name;
	
	@Column (name="discount_id")
	private long discountId;
	
	@Column (name="status")
	private int status;
}
