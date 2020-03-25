package com.billingsoftware.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ItemsTable",schema = "billingsoftware")
@Data
public class AddItems {

	@Id
	public Integer itemCode;
	public String itemName;
	public Integer itemPrice;
	public Integer getItemCode() {
		return itemCode;
	}
	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}
	public AddItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddItems(Integer itemCode, String itemName, Integer itemPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}


}
