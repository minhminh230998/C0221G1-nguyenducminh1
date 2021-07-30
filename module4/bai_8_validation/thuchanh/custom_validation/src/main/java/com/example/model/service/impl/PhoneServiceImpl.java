package com.example.model.service.impl;

import com.example.model.entity.Phone;
import com.example.model.repository.PhoneRepository;
import com.example.model.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements IPhoneService {
    @Autowired
    PhoneRepository phoneRepository;
    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }
}
