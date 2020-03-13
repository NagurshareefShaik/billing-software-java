package com.billingsoftware.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billingsoftware.model.AddItems;

public interface BillingDataRepo extends JpaRepository<AddItems, Integer>{

}
