package com.example.model.entity.contract;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Services;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "start_date", columnDefinition = "date")
    private String startDate;
    @Column(name = "end_date", columnDefinition = "date")
    private String endDate;
    private double deposit;
    private double totalMoney;
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "services_id", referencedColumnName = "id")
    private Services service;
    @OneToMany(mappedBy = "contract")
    List<ContractDetail> contractDetailList;

    public Contract(Integer id, String startDate, String endDate, double deposit, double totalMoney, Employee employee, Customer customer, Services service) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public Contract() {
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
}

