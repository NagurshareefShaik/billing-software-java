package com.billingsoftware.entity;

import java.util.List;

import com.billingsoftware.model.BillingItems;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BillingDataEntity {
	private int billNumber;
	private String billDate;
	private int totalAmount;
	private List<BillingItems> billingItems;

}
