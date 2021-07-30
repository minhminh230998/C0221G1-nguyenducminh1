package model.service;

import model.bean.service.Services;

import java.util.List;

public interface IService {
    public void createVilla(Services services);
    public Services findById(String id);
    public List<Services> findAll();
}
