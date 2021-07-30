package com.example.model.repository;

import com.example.model.entity.customer.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerTypeRepository extends PagingAndSortingRepository<CustomerType,Integer> {
}
