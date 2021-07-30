package com.example.model.repository;


import com.example.model.entity.employee.AppUser;
import com.example.model.entity.employee.UserRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
