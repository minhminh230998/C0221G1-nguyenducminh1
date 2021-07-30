package com.example.model.repository;

import com.example.model.entity.AppRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends PagingAndSortingRepository<AppRole,Long> {
   AppRole findByRoleName(String name);
}
