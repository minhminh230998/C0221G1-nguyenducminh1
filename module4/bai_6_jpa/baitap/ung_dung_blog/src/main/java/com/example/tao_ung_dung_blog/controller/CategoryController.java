package com.example.tao_ung_dung_blog.controller;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import com.example.tao_ung_dung_blog.model.entity.Category;
import com.example.tao_ung_dung_blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
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

    @GetMapping(value = {"/category"})
    public String goListCategory(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "/category/list";
    }

    @GetMapping(value = {"/create"})
    public String showFormCreateBlog(Model model) {
        model.addAttribute("category", new Category());
        return "/category/create";
    }

    @PostMapping(value = "/create")
    public String createCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }

    @GetMapping(value = "/edit")
    public String showFormEditCategory(@RequestParam int id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "/category/edit";
    }

    @PostMapping(value = "/edit")
    public String editCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }
    @GetMapping(value = "/delete")
    public String showFormDeleteCategory(@RequestParam int id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "/category/delete";
    }
    @PostMapping(value = "/delete")
    public String deleteBlog(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.remove(category.getId());
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/category";
    }
}
