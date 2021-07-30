package model.service.impl;

import model.Repository.CustomerTypeRepository;
import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.service.ICustomerType;

import java.util.List;

public class CustomerTypeImpl implements ICustomerType {
    CustomerTypeRepository customerTypeRepository=new CustomerTypeRepository();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id);
    }
}
