package com.example.model.service;

import com.example.model.entity.service.Services;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IServiceService {
    List<Services> findAllService();

    Services findByIdServiceService(String id);

    void saveService(Services service);
}
