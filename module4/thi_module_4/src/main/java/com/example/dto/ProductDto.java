package com.example.dto;

import com.example.model.entity.Manufacturer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class ProductDto {
    private  int id;
    @NotBlank(message = " Not Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]{1,}$",message = " Enter the correct format")
    private String name;
//    @NotNull(message = "&#8855; Not Null")
//    @Pattern(regexp = "^[0-9]{1,}",message = "; Enter the correct format")
    private int price;
    @NotBlank(message = " Not Null")
    private String describe;
    private Manufacturer manufacturer;

    public ProductDto(int id, @NotBlank(message = "Not Null") @Pattern(regexp = "^([a-zA-Z] )+$", message = "enter the correct format") String name, @NotBlank(message = "Not Null") @Pattern(regexp = "^[0-9]*$", message = "enter the correct format") int price, @NotBlank(message = "Not Null") String describe, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.manufacturer = manufacturer;
    }

    public ProductDto() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
