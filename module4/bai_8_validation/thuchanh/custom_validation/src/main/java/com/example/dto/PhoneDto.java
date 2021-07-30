package com.example.dto;

import com.example.model.entity.Phone;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PhoneDto implements Validator {
    private int id;
    private String number;

    public PhoneDto(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public PhoneDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneDto phone=(PhoneDto) target;
        if(phone.number.length()<10||phone.number.length()>11){
            errors.rejectValue("number","","phoneNumber not empty(Phone number >9 and <12)");
        }
        if(!phone.number.startsWith("0")&&phone.number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number","","phoneNumber not empty(start=0)");
        }
    }
}
