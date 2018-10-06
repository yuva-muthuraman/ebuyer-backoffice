package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="price")
public class Price {
	@Id
	private long id;
	
	@Column (name="discount_value")
	private String displayValue;
	
	@Column (name="discount_id")
	private long discountId;
	
	@Column (name="status")
	private int status;
	
	@Column (name="market_price")
	private String marketPrice;
	
	@Column (name="description")
	private String description;
}
