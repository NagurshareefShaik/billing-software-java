package com.billingsoftware.entity;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class BillingInformationEntity {
	private int billNumber;
	private Date billDate;
	private int totalAmount;
}
