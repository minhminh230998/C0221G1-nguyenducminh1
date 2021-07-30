package com.example.tao_ung_dung_blog.controller;

import com.example.tao_ung_dung_blog.model.entity.Blog;
import com.example.tao_ung_dung_blog.model.service.IBlogService;
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

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = {"", "/blog"})
    public String goListBlog(Model model) {
        Pageable pageable= PageRequest.of(0,5);
        Page<Blog> blogList = iBlogService.findAll(pageable);
        model.addAttribute("blogLists", blogList);
        return "/blog/list";
    }

    @GetMapping(value = {"/create"})
    public String showFormCreateBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "/blog/create";
    }

    @PostMapping(value = "/create")
    public String createBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/blog";
    }

    @GetMapping(value = "/edit")
    public String showFormEditBlog(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "/blog/edit";
    }

    @PostMapping(value = "/edit")
    public String editBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/blog";
    }
    @GetMapping(value = "/show")
    public String showBlog(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/blog/show";
    }
    @GetMapping(value = "/delete")
    public String showFormDeleteBlog(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/blog/delete";
    }
    @PostMapping(value = "/delete")
    public String deleteBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message", "success");
        return "redirect:/blog";
    }

}

