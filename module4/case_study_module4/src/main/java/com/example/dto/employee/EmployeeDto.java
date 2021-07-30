package com.example.dto.employee;

import com.example.model.entity.employee.AppUser;
import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EducationDegree;
import com.example.model.entity.employee.Position;

import javax.validation.constraints.*;


public class EmployeeDto {

    private Integer id;
    @NotBlank(message = " Not Null")
    private String name;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-2][0-9][0-9][0-9][/-][0-3][0-9][/-][0-3][0-9]$",message = " Enter the correct format")
    private String birthday;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[0-9]{9,10}$",message = " Enter the correct format")
    private String idCard;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    private Double salary;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^090[0-9]{7}||091[0-9]{7}$",message = " Enter the correct format")
    private String phone;
    @NotBlank(message = " Not Null")
    @Email
    private String email;
    @NotBlank(message = " Not Null")
    private String address;

    private Position position;

    private EducationDegree educationDegree;

    private Division division;
    private AppUser appUser;


    public EmployeeDto() {
    }

    public EmployeeDto(Integer id, String name, String birthday, String idCard, Double salary, String phone, String email, String address, Position position, EducationDegree educationDegree, Division division) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
