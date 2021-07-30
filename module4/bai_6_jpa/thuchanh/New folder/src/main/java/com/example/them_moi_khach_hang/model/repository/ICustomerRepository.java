package com.example.them_moi_khach_hang.model.repository;


import com.example.them_moi_khach_hang.model.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {

}
