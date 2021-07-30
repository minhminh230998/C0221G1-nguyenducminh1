package com.example.controller;

import com.example.model.entity.Customer;
import com.example.model.service.ICustomerService;
import com.example.model.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IProvinceService provinceService;

    @GetMapping(value = {"", "/customers"})
    public ModelAndView listCustomers(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
                                      @RequestParam(name = "size", required = false, defaultValue = "5") Integer size,
                                      @RequestParam(name = "sort", required = false, defaultValue = "ASC") String sort) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> customers = customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping(value = {"/create-customer"})
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("provinces", provinceService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            modelAndView.addObject("provinces", provinceService.findAll());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/customer/error");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/customer/error");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:customers";
    }

    @PostMapping("/search")
    public String searchCustomer(@RequestParam String firstName, Model model,
                                 @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
                                 @RequestParam(name = "size", required = false, defaultValue = "5") Integer size,
                                 @RequestParam(name = "sort", required = false, defaultValue = "ASC") String sort) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Customer> customers = customerService.findByName(firstName, pageable);
        model.addAttribute("customers", customers);
        return "/customer/list";
    }
}
