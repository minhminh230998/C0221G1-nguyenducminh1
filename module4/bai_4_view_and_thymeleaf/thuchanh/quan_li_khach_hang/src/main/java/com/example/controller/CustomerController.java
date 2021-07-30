package com.example.controller;

import com.example.model.bean.Customer;
import com.example.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService icustomer;
    @GetMapping(value = {"/","/customer"})
    public String listCustomer(Model model){
        List<Customer> customers=icustomer.findAll();
        model.addAttribute("customers",customers);
        return "/customer/list";
    }
    @GetMapping(value = "/customer/create")
    public String formCreateCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "/customer/create";
    }
    @PostMapping(value = "/customer/create")
    public String createCustomer(@ModelAttribute Customer customer){
        icustomer.save(customer);
        return "redirect:/customer";
    }
    @GetMapping(value = "customer/{id}/update")
    public String formUpdateCustomer(Model model,@PathVariable int id){
        Customer customer=icustomer.findById(id);
        model.addAttribute("customer",customer);
        return "/customer/update";
    }
    @PostMapping(value = "/customer/update")
    public String updateCustomer(@ModelAttribute Customer customer){
        icustomer.updateCustomer(customer.getId(),customer);
        return "redirect:/customer";
    }
    @GetMapping("customer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", icustomer.findById(id));
        return "/customer/delete";
    }
    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        icustomer.deleteCustomer(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
    @GetMapping("customer/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", icustomer.findById(id));
        return "/customer/view";
    }

}
