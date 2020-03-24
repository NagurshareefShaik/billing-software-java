package com.billingsoftware.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billingsoftware.entity.AddItemEntity;
import com.billingsoftware.entity.BillingDataEntity;
import com.billingsoftware.model.AddItems;
import com.billingsoftware.model.BillingData;
import com.billingsoftware.repositorty.AddItemsRepo;
import com.billingsoftware.repositorty.BillingDataRepo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value="/billing-software")
@Slf4j
@NoArgsConstructor
public class BillingController {

	@Autowired
	AddItemsRepo addItemsRepo;
	
	@Autowired
	BillingDataRepo billingDataRepo;

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
	@RequestMapping(value = "/getItemData",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public AddItems getItemData(@RequestBody AddItemEntity addItemsEntity) {
		log.info("search method starts");
		Optional<AddItems> itemData=addItemsRepo.findById(addItemsEntity.getItemCode());
		if(itemData.isPresent()) {
			return itemData.get();
		}
		else {
			return new AddItems();
		}
	}
	@RequestMapping(value = "/saveBillingData",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public void saveBillingData(@RequestBody BillingDataEntity billingDataEntity) {
		BillingData billingData=this.formBillingData(billingDataEntity);
		billingDataRepo.save(billingData);
	}
	private BillingData formBillingData(BillingDataEntity billingDataEntity) {
		BillingData data=new BillingData();
		data.setBillNumber(billingDataEntity.getBillNumber());
		data.setBillDate(null);
		data.setBillingItems(billingDataEntity.getBillingItems());
		data.setTotalAmount(billingDataEntity.getTotalAmount());
		return data;
		
	}
}
