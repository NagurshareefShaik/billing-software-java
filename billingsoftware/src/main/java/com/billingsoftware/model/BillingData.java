package com.billingsoftware.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BillingData",schema = "billingsoftware")
@Data
public class BillingData {

	@Id
	private int billNumber;
	private Date billDate;
	private int totalAmount;
	@ManyToMany(targetEntity = BillingItems.class)
	private List<BillingItems> billingItems;
	
}
