package com.example.controller;

import com.example.model.entity.Blog;
import com.example.model.service.IBlogService;
import com.example.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = {"", "/blog"})
    public String goListBlog(Model model,@PageableDefault(size = 5)Pageable pageable,
                             @RequestParam Optional<String> name) {

//        Page<Blog> blogList = iBlogService.findAll(pageable);
        String names="";
        if(name.isPresent()){
            names=name.get();
        }
        Page<Blog> blogs = iBlogService.findByName(pageable, names);
        model.addAttribute("blogLists", blogs);
        model.addAttribute("names", names);
        model.addAttribute("listCategory", iCategoryService.findAll());
        return "/blog/list";
    }

    @GetMapping(value = "/display")
    public String goListBlogByIdCategory(@RequestParam int id, Model model, @PageableDefault(size = 3) Pageable pageable) {
        Page<Blog> blogList = iBlogService.findByIdCategory(pageable, id);
        model.addAttribute("blogLists", blogList);
        return "/blog/display_menu";
    }

    @GetMapping(value = {"/create"})
    public String showFormCreateBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "/blog/create";
    }

    @PostMapping(value = "/create")
    public String createBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {

        blog.setDate(new Date());
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
//    @GetMapping("/search")
//    public String searchBlog(@RequestParam Optional<String> name, Model model, @PageableDefault(size = 5) Pageable pageable) {
////        Pageable pageable = PageRequest.of(page, size);
//        String names="";
//        if(name.isPresent()){
//            names=name.get();
//        }
//        Page<Blog> blogs = iBlogService.findByName(pageable, names);
//        model.addAttribute("blogLists", blogs);
//        model.addAttribute("names", names);
//        return "/blog/list";
//    }

}

