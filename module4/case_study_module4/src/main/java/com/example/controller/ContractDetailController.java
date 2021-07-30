package com.example.controller;

import com.example.dto.contract.ContractDetailDto;
import com.example.dto.contract.ContractDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.service.IContractDetailService;
import com.example.model.service.IContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
@RequestMapping(value = "/contractDetail")
public class ContractDetailController {
    @Autowired
    IContractDetailService iContractDetailService;
    @Autowired
    IContractService iContractService;
    @GetMapping(value = "/create")
    public String ShowFormCreateContractDetail(Model model) {
        model.addAttribute("contractDetailDto", new ContractDetailDto());
        model.addAttribute("contractList",iContractService.findAll());
        model.addAttribute("attachServiceList",iContractDetailService.findAllAttachService());

        return "/contractdetail/create-contractdetail";
    }

    @PostMapping(value = "/create")
    public String createContractDetail(@ModelAttribute @Valid ContractDetailDto contractDetailDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("contractList",iContractService.findAll());
            model.addAttribute("attachServiceList",iContractDetailService.findAllAttachService());
            return "/contractdetail/create-contractdetail";
        }
        ContractDetail contractDetail=new ContractDetail();
        BeanUtils.copyProperties(contractDetailDto,contractDetail);
        iContractDetailService.saveContractDetail(contractDetail);

        redirectAttributes.addFlashAttribute("message", "Update contract successfully!");
        return "redirect:/home";
    }

}
