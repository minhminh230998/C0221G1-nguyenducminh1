package model.service.impl;

import model.Repository.CustomerRepository;
import model.bean.customer.Customer;
import model.service.ICustomerService;

import java.util.List;

public class CustomerServiceimpl implements ICustomerService {
    CustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public String[] createCustomer(Customer customer) {
        boolean check=true;
        String msgId="";
        String msgPhone="";
        String msgIdCard="";
        String msgEmail="";
        if("".equals(customer.getId())){
            msgId="Please input Id";
            check=false;
        }else if(!customer.getId().matches("^KH-[0-9]{4}$")){
            msgId= "Please enter the correct format";
            check=false;
        }

        if("".equals(customer.getPhone())){
            msgPhone="Please input Phone";
            check=false;
        }else if(!customer.getPhone().matches("^09[0-9]{7,8}$")){
            msgPhone= "Please enter the correct format";
            check=false;
        }

        if("".equals(customer.getIdCard())){
            msgIdCard="Please input Id Card";
            check=false;
        }else if(!String.valueOf(customer.getIdCard()).matches("^[0-9]{9}$")){
            msgIdCard= "Please enter the correct format";
            check=false;
        }

        if("".equals(customer.getEmail())){
            msgEmail="Please input Email";
            check=false;
        }else if(!customer.getEmail().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")){
            msgEmail= "Please enter the correct format";
            check=false;
        }
        if(check) {
            customerRepository.createCustomer(customer);
        }
        return check ? new String[]{} : new String[]{msgId,msgPhone,msgIdCard,msgEmail};
    }
    @Override
    public boolean editCustomer(Customer customer) {
        return customerRepository.editCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(String id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}