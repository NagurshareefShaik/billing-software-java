package com.billingsoftware.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddItemEntity {

  public  Integer itemCode;
	public  String itemName;
	public  Integer itemPrice;

}
