package com.example.controller;

import com.example.dto.QuestionDto;
import com.example.model.entity.Question;
import com.example.model.service.IQuestionTypeService;
import com.example.model.service.IQuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Date;
import java.util.Optional;

@Controller
public class QuestionController {
    @Autowired
    IQuestionService iQuestionService;
    @Autowired
    IQuestionTypeService iQuestionTypeService;
    @GetMapping(value = {"", "/question"})
    public String findAll(Model model, @PageableDefault(size = 3)Pageable pageable, @RequestParam Optional<String> title,@RequestParam Optional<String> nameQuestionType) {

        String titles="";
        if(title.isPresent()){
            titles = title.get();
        }
        String nameQuestionTypes="";
        if(nameQuestionType.isPresent()){
            nameQuestionTypes = nameQuestionType.get();
        }

        Page<Question> questions = iQuestionService.findQuestionByTitleAndAndQuestionTypeName(pageable,titles,nameQuestionTypes);
        model.addAttribute("questions", questions);
        model.addAttribute("titles", titles);
        model.addAttribute("nameQuestionTypes", nameQuestionTypes);
        return "/question/list";
    }

    @GetMapping(value = "/question/create")
    public String ShowFormCreateProduct(Model model) {
        model.addAttribute("questionDto", new QuestionDto());
        model.addAttribute("questionTypes",iQuestionTypeService.findAll());
        return "/question/create";
    }

    @PostMapping(value = "/question/create")
    public String createProduct(@ModelAttribute @Valid QuestionDto questionDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("questionTypes",iQuestionTypeService.findAll());
            return "/question/create";
        }
        Question question=new Question();

        BeanUtils.copyProperties(questionDto,question);
        long millis=System.currentTimeMillis();
        Date date=new java.sql.Date(millis);
        question.setDateCreate(date.toString());
        question.setStatus("Chờ Phản Hồi");
        iQuestionService.save(question);
        redirectAttributes.addFlashAttribute("message", "Create question successfully!");
        return "redirect:/question";
    }
//    @GetMapping(value = "/product/update")
//    public String showFormUpdateProduct(@RequestParam int id, Model model){
//        Question product=iProductService.findById(id);
//        QuestionDto productDto=new QuestionDto();
//        BeanUtils.copyProperties(product,productDto);
//        model.addAttribute("productDto",productDto);
//        model.addAttribute("manufacturers",iManufacturerService.findAll());
//        return "/question/update";
//    }
//    @PostMapping(value = "/product/update")
//    public String updateCustomer(@ModelAttribute Question product){
//        iProductService.save(product);
//        return "redirect:/question";
//    }
//
    @GetMapping("/question/delete")
    public String delete(@RequestParam int question, RedirectAttributes redirect) {
        iQuestionService.deleteById(question);
        redirect.addFlashAttribute("message", "Removed question successfully!");
        return "redirect:/question";
    }

}
