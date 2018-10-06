package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.ebuyer.backoffice.model.enums.Unit;

import lombok.Data;

@Data
@Entity (name="discount")
public class Discount {
	@Id
	private long id;
	
	@Column (name="name", length=50)
	private String name;
	
	@Column (name="discount_value", length=10)
	private double discountValue;
	
	@Column (name="discount_unit", length=1)
	private Unit discountUnit;
	
	@Column (name="start_date", length=30)
	private String startDate;
	
	@Column (name="end_date", length=30)
	private String endDate;
	
	@Column (name="status", length=1)
	private String status;
	
	@Column (name="is_flat", length=5)
	private boolean isFlat;
}
