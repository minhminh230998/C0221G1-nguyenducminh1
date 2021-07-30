package com.example.model.repository;

import com.example.model.entity.Phone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends PagingAndSortingRepository<Phone,Integer> {
}
