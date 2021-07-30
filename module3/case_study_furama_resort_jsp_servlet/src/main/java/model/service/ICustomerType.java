package model.service;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;

import java.util.List;

public interface ICustomerType {
    public  List<CustomerType> findAll();
    public CustomerType findById(int id);

}
