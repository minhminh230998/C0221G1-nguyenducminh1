package com.example.model.repository;

import com.example.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
//    @Query(value="select c from Customer c where c.firstName like %?%")
    Page<Customer> findAllByFirstNameContaining(String name, Pageable pageable);
}
