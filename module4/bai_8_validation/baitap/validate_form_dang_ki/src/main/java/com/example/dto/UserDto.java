package com.example.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Size(min=5,max = 50,message =
            "Please enter firstname")
    @NotBlank(message =
            "Please enter the correct format")
    private String firstname;
    @NotBlank(message =
            "Please enter lastname")
    @Size(min=5,max = 50,message =
            "Please enter the correct format")
    private String lastname;
    @NotBlank(message = "Please enter phone number")
    @Pattern(regexp = "^0[0-9]{9,10}",message = "Invalid format phone number(0xxxxxxxxx &0xxxxxxxxxx)")
    private String phoneNumber;
    @NotNull(message = "Invalid format age")
    @Min(value = 18,message = "Invalid format age(18+)")
    private int age;
    @NotBlank(message = "Please enter email")
    @Email(message = "Invalid format email(abc@gmail.com)")
    private String email;

    public UserDto(int id, @Size(min = 5, max = 50, message =
            "Please enter the correct format") @NotBlank(message =
            "Please enter the correct format") String firstname, @NotBlank(message =
            "Please enter the correct format") @Size(min = 5, max = 50, message =
            "Please enter the correct format") String lastname, @Pattern(regexp = "^0//d{9,10}", message = "Invalid format phone number") String phoneNumber, @Min(value = 18, message = "Invalid format age") int age, @Email(message = "Invalid format email(abc@gmail.com)") String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
