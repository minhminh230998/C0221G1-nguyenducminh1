package com.example.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDto {

    private int id;
    @NotBlank(message = "Please input name(blank)")
    @Size(min=2,max = 30,message = "Invalid format")
    private String name;
    @Min(value = 18,message = "Please enter true age")
    private int age;

    public UserDto() {
    }

    public UserDto(int id, @NotBlank(message = "Please input name(blank)") @Size(min = 2, max = 30, message = "Invalid format") String name, @Min(value = 18, message = "Please enter true age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserDto(@NotBlank(message = "Please input name(blank)") @Size(min = 2, max = 30, message = "Invalid format") String name, @Min(value = 18, message = "Please enter true age") int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
