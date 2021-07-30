package com.example.dto.customer;

import com.example.dto.contract.ContractDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.CustomerType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CustomerDto {
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^KH-[0-9]{4}$",message = " Enter the correct format")
    private String id;
    @NotBlank(message = " Not Null")

    private String name;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-2][0-9][0-9][0-9][/-][0-3][0-9][/-][0-3][0-9]$",message = " Enter the correct format")
    private String birthday;
    private String gender ;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-9]{9,10}$",message = " Enter the correct format")
    private String idCard ;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^090[0-9]{7}||091[0-9]{7}$",message = " Enter the correct format")
    private String phone;
    @NotBlank(message = " Not Null")
    @Email
    private String email;
    @NotBlank(message = " Not Null")
    private String address;

    private CustomerType customerType;


    public CustomerDto() {
    }

    public CustomerDto(String id, String name, String birthday, String gender, String idCard, String phone, String email, String address, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
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
