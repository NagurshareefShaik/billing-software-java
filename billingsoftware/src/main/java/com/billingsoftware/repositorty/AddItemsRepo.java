package com.billingsoftware.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billingsoftware.model.AddItems;

public interface AddItemsRepo extends JpaRepository<AddItems, Integer>{

}
