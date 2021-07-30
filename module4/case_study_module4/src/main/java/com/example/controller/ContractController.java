package com.example.controller;

import com.example.dto.contract.ContractDetailDto;
import com.example.dto.contract.ContractDto;
import com.example.dto.service.ServiceDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.service.Services;
import com.example.model.repository.contract.IAttachServiceRepository;
import com.example.model.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    IServiceService serviceService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    IContractDetailService iContractDetailService;
    @GetMapping(value = "/create")
    public String ShowFormCreateContract(Model model) {
        model.addAttribute("contractDto", new ContractDto());
        model.addAttribute("customerList",iCustomerService.findAllCustomer());
        model.addAttribute("employeeList",iEmployeeService.findAllEmployee());
        model.addAttribute("serviceList",serviceService.findAllService());
        return "/contract/create-contract";
    }
    @GetMapping(value = "/create1")
    public String ShowFormCreateContract1(Model model, @RequestParam String id) {
        model.addAttribute("contractDto", new ContractDto());
        if(id==null){
            model.addAttribute("customerList",iCustomerService.findAllCustomer());
        }else {
            model.addAttribute("customers", iCustomerService.findByIdCustomer(id));
        }
        model.addAttribute("employeeList",iEmployeeService.findAllEmployee());
        model.addAttribute("serviceList",serviceService.findAllService());
        return "/contract/create-contract";
    }

    @PostMapping(value = "/create")
    public String createContract(@ModelAttribute @Valid ContractDto contractDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new ContractDto().validate(contractDto,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("customerList",iCustomerService.findAllCustomer());
            model.addAttribute("employeeList",iEmployeeService.findAllEmployee());
            model.addAttribute("serviceList",serviceService.findAllService());
            return "/contract/create-contract";
        }
        Contract contract=new Contract();
        BeanUtils.copyProperties(contractDto,contract);
        int date=contractDto.daysBetweens(contractDto.getStartDate(),contractDto.getEndDate());
        double date1=Double.parseDouble(String.valueOf(date));
        contract.setTotalMoney(date1*contractDto.getService().getCost());
        iContractService.saveContract(contract);
        model.addAttribute("contracts", iContractService.findById(contract.getId()));
        model.addAttribute("contract", iContractService.findById(contract.getId()));
        model.addAttribute("contractDetailDto", new ContractDetailDto());
        model.addAttribute("attachServiceList",iContractDetailService.findAllAttachService());
        return "/contractdetail/create-contractdetail";
    }
    @GetMapping(value = "/pageCustomerService")
    public String findAllCustomerService(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("pageCustomerService",iContractService.findAllCustomerService(pageable));
        return "/contract/list-customer-service";
    }
    @GetMapping(value = "/attachDetail")
    public String findAllAS(@RequestParam Integer id, Model model){
        model.addAttribute("listAttach",iContractDetailService.findAllAttachServiceById(id));
        return "/contract/list-att";
    }

}
