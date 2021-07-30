package com.example.model.repository;

import com.example.model.entity.Borrow;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BorrowRepository extends PagingAndSortingRepository<Borrow,Integer> {
//    @Query(value="delete from borrow where code=? ",nativeQuery=true)
    void deleteByCode(int code);
    @Query(value="select * from borrow where `code` = ? ",nativeQuery=true)
    Borrow findBorrowByCode(int code);
}
