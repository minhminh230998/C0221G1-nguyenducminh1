package model.service;

import model.bean.service.ServiceType;

import java.util.List;

public interface IServiceType {
    public List<ServiceType> findAll();
    public ServiceType findById(int id);
}
