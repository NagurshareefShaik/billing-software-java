package com.billingsoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billingsoftware.entity.AddItemEntity;
import com.billingsoftware.model.AddItems;
import com.billingsoftware.repositorty.AddItemsRepo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value="/billing-software")
@Slf4j
public class BillingController {
	
	@Autowired
	AddItemsRepo addItemsRepo;
	
	@RequestMapping(value = "/getData",method = RequestMethod.GET)
	@ResponseBody
	public List<AddItems> getAddItemData(){
		log.info("***getData Method starts*******");
		List<AddItems> listData=addItemsRepo.findAll();
		log.info("***getData Method ends*******");
		return listData;
	}
	@RequestMapping(value = "/insert",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public List<AddItems> insertData(@RequestBody AddItemEntity addItemsEntity) {
		log.info("**Save Method starts*******");
		AddItems addItem=new AddItems(addItemsEntity.getItemCode(),addItemsEntity.getItemName(),addItemsEntity.getItemPrice());
		addItemsRepo.save(addItem);
		log.info("**Save Method Ends*******");
		return addItemsRepo.findAll();
	}
}
