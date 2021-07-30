package model.service.impl;

import model.Repository.ServiceRepository;
import model.bean.service.Services;
import model.service.IService;

import java.util.List;

public class ServiceServiceimpl implements IService {
    ServiceRepository serviceRepository=new ServiceRepository();
    @Override
    public void createVilla(Services services) {
        serviceRepository.createService(services);
    }

    @Override
    public Services findById(String id) {
        return serviceRepository.findById(id);
    }

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }
}
