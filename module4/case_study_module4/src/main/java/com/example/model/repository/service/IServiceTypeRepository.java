package com.example.model.repository.service;

import com.example.model.entity.service.ServiceType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IServiceTypeRepository extends PagingAndSortingRepository<ServiceType,Integer> {
}
