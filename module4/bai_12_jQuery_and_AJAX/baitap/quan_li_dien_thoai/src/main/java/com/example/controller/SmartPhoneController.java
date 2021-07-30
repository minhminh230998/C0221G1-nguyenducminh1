package com.example.controller;

import com.example.model.entity.SmartPhone;
import com.example.model.service.ISmartPhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@RestController
@RequestMapping("/smartphones")
@CrossOrigin
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartphoneService;

    @PostMapping(value = "/create")
    public ResponseEntity<SmartPhone> createSmartphone(@RequestBody SmartPhone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
    }
//    @GetMapping("/list")
//    public ModelAndView getAllSmartphonePage() {
//        ModelAndView modelAndView = new ModelAndView("/list");
//        modelAndView.addObject("smartphones", smartphoneService.findAll());
//        return modelAndView;
//    }

    @GetMapping("/list")
    public ResponseEntity<Iterable<SmartPhone>> listPhones() {
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<SmartPhone> deleteSmartphone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SmartPhone> getSmartphone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.OK);
    }
}