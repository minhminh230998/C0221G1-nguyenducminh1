package com.example.dto.employee;

import com.example.model.entity.employee.Employee;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class AppUserDto {
    private Long userId;
    private String userName;
    private String encrytedPassword;
    private Employee employee;

    public AppUserDto() {
    }

    public AppUserDto(Long userId, String userName, String encrytedPassword, Employee employee) {
        this.userId = userId;
        this.userName = userName;
        this.encrytedPassword = encrytedPassword;
        this.employee = employee;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
