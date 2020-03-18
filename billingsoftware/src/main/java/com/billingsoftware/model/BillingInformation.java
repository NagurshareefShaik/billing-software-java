package com.billingsoftware.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BillingInfo")
public class BillingInformation {

	@Id
	private int billNumber;
	private Date billDate;
	//	private List<AddItems> items;
	private int totalAmount;
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	//	public List<AddItems> getItems() {
	//		return items;
	//	}
	//	public void setItems(List<AddItems> items) {
	//		this.items = items;
	//	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}
