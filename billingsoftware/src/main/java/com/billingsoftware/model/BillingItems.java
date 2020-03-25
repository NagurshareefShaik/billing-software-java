package com.billingsoftware.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="BillingItems")
public class BillingItems {
	
	@Id
	private int itemCode;
	private String itemName;
    private int itemPrice;
    private int itemQuantity;
	
}
