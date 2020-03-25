package com.billingsoftware.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billingsoftware.model.BillingItems;

public interface BillingItemsRepo extends JpaRepository<BillingItems,Integer>{

}
