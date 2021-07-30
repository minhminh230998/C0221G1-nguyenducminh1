package model.service.impl;

import model.Repository.RentTypeRepository;
import model.bean.service.RentType;
import model.service.IRentType;

import java.util.List;

public class RentTypeImpl implements IRentType {
    RentTypeRepository rentTypeRepository=new RentTypeRepository();
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAllRentType();
    }

    @Override
    public RentType findById(int id) {
        return rentTypeRepository.findRentTypeById(id);
    }
}
