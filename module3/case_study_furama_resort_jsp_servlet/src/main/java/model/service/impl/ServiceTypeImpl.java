package model.service.impl;

import model.Repository.ServiceTypeRepository;
import model.bean.service.ServiceType;
import model.service.IServiceType;

import java.util.List;

public class ServiceTypeImpl implements IServiceType {
    ServiceTypeRepository serviceTypeRepository=new ServiceTypeRepository();
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAllServiceType();
    }

    @Override
    public ServiceType findById(int id) {
        return serviceTypeRepository.findServiceTypeById(id);
    }
}
