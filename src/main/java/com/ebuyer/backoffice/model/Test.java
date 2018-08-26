package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity (name="test")
public class Test {
	@Id
	public String id;
	
	@Column (name="comments", length=200)
	public String comments;
}
