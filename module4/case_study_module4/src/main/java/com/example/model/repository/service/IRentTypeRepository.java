package com.example.model.repository.service;

import com.example.model.entity.service.RentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends PagingAndSortingRepository<RentType,Integer> {
}
