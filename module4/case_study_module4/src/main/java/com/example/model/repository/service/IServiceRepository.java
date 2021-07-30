package com.example.model.repository.service;

import com.example.model.entity.service.Services;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface IServiceRepository extends PagingAndSortingRepository<Services,String> {
}
