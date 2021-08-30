package com.example.model.repository;

import com.example.model.entity.BenhNhan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenhNhanRepository extends PagingAndSortingRepository<BenhNhan,Integer> {
}
