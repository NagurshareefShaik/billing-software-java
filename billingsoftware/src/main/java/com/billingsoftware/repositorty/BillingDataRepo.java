package com.billingsoftware.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billingsoftware.model.BillingData;

public interface BillingDataRepo extends JpaRepository<BillingData, Integer>{

}
