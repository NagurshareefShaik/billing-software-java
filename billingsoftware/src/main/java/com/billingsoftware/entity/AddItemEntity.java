package com.billingsoftware.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AddItemEntity {
	
	private static Integer itemCode;
	private static String itemName;
	private static Integer itemPrice;

}
