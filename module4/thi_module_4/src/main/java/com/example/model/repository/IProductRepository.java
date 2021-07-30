package com.example.model.repository;

import com.example.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
@Query(value="select * from product where `name` like %?1% and price like %?2%" ,nativeQuery=true)
    Page<Product> findByName(Pageable pageable,  String name, String price);

}
