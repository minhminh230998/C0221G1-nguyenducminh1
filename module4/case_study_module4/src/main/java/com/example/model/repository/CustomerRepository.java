package com.example.model.repository;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,String> {
    @Query(value="select * from customer where `name` like :name",nativeQuery=true)
    Page<Customer> findByNameContaining(@Param("name") String name, Pageable pageable);
}
