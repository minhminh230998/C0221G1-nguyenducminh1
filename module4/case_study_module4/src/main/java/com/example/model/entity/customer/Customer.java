package com.example.model.entity.customer;

import com.example.model.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    @Column(columnDefinition = "date")
    private String birthday;
    private String gender ;
    private String idCard ;
    private String phone;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName = "id")
    private CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;

    public Customer() {
    }

    public Customer(String id, String name, String birthday, String gender, String idCard, String phone, String email, String address, CustomerType customerType, List<Contract> contractList) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.contractList = contractList;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
