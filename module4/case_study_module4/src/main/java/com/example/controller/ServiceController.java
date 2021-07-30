package com.example.controller;

import com.example.dto.customer.CustomerDto;
import com.example.dto.service.ServiceDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.service.Services;
import com.example.model.repository.service.IServiceRepository;
import com.example.model.service.IRentTypeService;
import com.example.model.service.IServiceService;
import com.example.model.service.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    IServiceService iServiceService;
    @Autowired
    IServiceTypeService iServiceTypeService;
    @Autowired
    IRentTypeService iRentTypeService;
    @GetMapping(value = "/create")
    public String ShowFormCreateService(Model model) {
        model.addAttribute("serviceDto", new ServiceDto());
        model.addAttribute("rentTypeList",iRentTypeService.findAll());
        model.addAttribute("serviceTypeList",iServiceTypeService.findAll());
        return "/service/create-service";
    }

    @PostMapping(value = "/create")
    public String createService(@ModelAttribute @Valid ServiceDto serviceDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("rentTypeList",iRentTypeService.findAll());
            model.addAttribute("serviceTypeList",iServiceTypeService.findAll());
            return "/service/create-service";
        }
        Services services=new Services();
        BeanUtils.copyProperties(serviceDto,services);
        iServiceService.saveService(services);
        redirectAttributes.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/customer/list";
    }
}
