package com.billingsoftware.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billingsoftware.model.AddItems;
import com.billingsoftware.model.BillingInformation;

public interface BillingInfoRepo extends JpaRepository<BillingInformation, Integer>{

}
