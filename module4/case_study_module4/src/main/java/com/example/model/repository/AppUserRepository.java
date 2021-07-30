package com.example.model.repository;


import com.example.model.entity.employee.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository  extends PagingAndSortingRepository<AppUser,Long> {
    AppUser findByUserName(String name);
}
