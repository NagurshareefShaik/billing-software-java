package com.billingsoftware.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddItemEntity {

	private  Integer itemCode;
	private  String itemName;
	private  Integer itemPrice;

}
