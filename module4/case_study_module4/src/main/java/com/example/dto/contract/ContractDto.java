package com.example.dto.contract;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Services;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ContractDto implements Validator {
    private Integer id;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-2][0-9][0-9][0-9][/-][0-3][0-9][/-][0-3][0-9]$",message = " Enter the correct format")
    
    private String startDate;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-2][0-9][0-9][0-9][/-][0-3][0-9][/-][0-3][0-9]$",message = " Enter the correct format")
    private String endDate;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    private double deposit;
    private double totalMoney;
    private Employee employee;
    private Customer customer;
    private Services service;

    public ContractDto(Integer id, String startDate, String endDate, double deposit, double totalMoney, Employee employee, Customer customer, Services service) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public ContractDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
    public  int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    public  int daysBetweens(String d2, String d1){
        Date date1 = null;
        Date date2 = null;
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
            cal1.setTime(date1);
            cal2.setTime(date2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return   daysBetween(cal1.getTime(),cal2.getTime());
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto=(ContractDto) target;
        int a =    daysBetweens(contractDto.getStartDate(),contractDto.getEndDate());
        if(a<=0){
            errors.rejectValue("startDate","","Start date < End Date");
        }
    }
}
