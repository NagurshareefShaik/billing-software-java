package com.billingsoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billingsoftware.model.AddItems;
import com.billingsoftware.repositorty.AddItemsRepo;

@Controller
@RequestMapping(value="/billing-software")
public class BillingController {
	
	@Autowired
	AddItemsRepo addItemsRepo;
	
	@RequestMapping(value = "/getData",method = RequestMethod.GET)
	@ResponseBody
	public List<AddItems> getAddItemData(){
		System.out.println("***getData Method starts*******");
		List<AddItems> listData=addItemsRepo.findAll();
		System.out.println("***getData Method ends*******");
		return listData;
	}
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public void insertData(AddItems addItems) {
//		if(Objects.nonNull(addItems)) {
//			addItemsRepo.save(addItems);
//			return true;
//		}
//		else {
//			return false;
//		}
		System.out.println("insert");
	}
	

}
