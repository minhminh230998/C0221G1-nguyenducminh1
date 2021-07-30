package com.example.controller;

import com.example.model.entity.Category;
import com.example.model.service.IBlogService;
import com.example.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;
    @Autowired
    IBlogService iBlogService;

    @GetMapping(value = {"/category"})
    public String goListCategory(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "/category/list";
    }
    @GetMapping(value = {"/create-category"})
    public String showFormCreateCategory(Model model) {
        model.addAttribute("category", new Category());
        return "/category/create";
    }
    @PostMapping(value = "/create-category")
    public String createCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }

    @GetMapping(value = "/edit-category")
    public String showFormEditCategory(@RequestParam int id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "/category/edit";
    }

    @PostMapping(value = "/edit-category")
    public String editCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }
    @GetMapping(value = "/delete-category")
    public String showFormDeleteCategory(@RequestParam int id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "/category/delete";
    }
    @PostMapping(value = "/delete-category")
    public String deleteBlog(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.remove(category.getId());
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }
}
