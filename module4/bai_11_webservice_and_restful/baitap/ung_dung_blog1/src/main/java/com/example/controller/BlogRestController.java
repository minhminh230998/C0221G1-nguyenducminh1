package com.example.controller;

import com.example.model.entity.Blog;
import com.example.model.entity.Category;
import com.example.model.service.IBlogService;
import com.example.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/blogs")
public class BlogRestController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping(value = {"/list/{name}"})
    public ResponseEntity<Page<Blog>> goListBlog( @RequestParam int page,
                             @PathVariable Optional<String> name) {


        String names="";
        if(name.isPresent()){
            names=name.get();
        }
        Page<Blog> blogs = iBlogService.findByName(PageRequest.of(page,2), names);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping(value = {"/category"})
    public ResponseEntity<List<Category>> goListCategory() {
        List<Category> categoryList = iCategoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping(value = "/display")
    public ResponseEntity<Page<Blog>> goListBlogByIdCategory(@RequestParam int id, Model model, @PageableDefault(size = 3) Pageable pageable) {
        Page<Blog> blogList = iBlogService.findByIdCategory(pageable, id);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @GetMapping(value = "/show")
    public ResponseEntity<Blog> showBlog(@RequestParam int id, Model model) {
        Blog blog= iBlogService.findById(id);
        if (blog==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

}
