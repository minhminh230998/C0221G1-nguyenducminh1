package com.example.model.repository;

import com.example.model.entity.Manufacturer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IManufacturerRepository extends PagingAndSortingRepository<Manufacturer,Integer> {
}
