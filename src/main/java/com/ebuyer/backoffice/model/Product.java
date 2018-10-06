package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.ebuyer.backoffice.model.enums.ProductCondition;

import lombok.Data;

@Entity(name="product")
@Data
public class Product {
	@Id
	private long id;
	
	@Column (name="name")
	private String name;
	
	@Column (name="display_name")
	private String displayName;
	
	@Column (name="description")
	private String description;
	
	@Column (name="price_id")
	private long priceId;
	
	@Column (name="media_id")
	private long mediaId;
	
	@Column (name="is_available")
	private boolean isAvailable;
	
	@Column (name="category_id")
	private long categoryId;
	
	@Column (name="condition")
	private ProductCondition condition;
}
