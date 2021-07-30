package com.example.controller;

import com.example.model.bean.Product;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iproductService;

    @GetMapping(value = {"/", "/product"})
    public String findAll(Model model) {
        List<Product> products = iproductService.findAll();
        model.addAttribute("products", products);
        return "/product/list";
    }

    @GetMapping(value = "/product/create")
    public String ShowFormCreateProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/product/create";
    }

    @PostMapping(value = "/product/create")
    public String createProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        iproductService.createProduct(product);
        redirectAttributes.addFlashAttribute("message", "Update customer successfully!");
        return "redirect:/product";
    }
    @GetMapping(value = "/product/update")
    public String showFormUpdateProduct(@RequestParam int id, Model model){
        Product product=iproductService.findById(id);
        model.addAttribute("product",product);
        return "/product/update";
    }
    @PostMapping(value = "/product/update")
    public String updateCustomer(@ModelAttribute Product product){
        iproductService.updateProduct(product.getId(),product);
        return "redirect:/product";
    }
    @GetMapping("product/delete")
    public String showFormDelete(@RequestParam int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/product/delete";
    }
    @PostMapping("/product/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirect) {
        iproductService.deleteProduct(product.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/product";
    }
    @PostMapping("/product/delete1")
    public String delete1(Product product, RedirectAttributes redirect) {
        iproductService.deleteProduct(product.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/product";
    }
    @GetMapping("product/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/product/view";
    }
    @GetMapping(value = "/product/search")
    public String searchProduct(@RequestParam String search,Model model){
        List<Product> products=iproductService.findByName(search);
        if(products.size()!=0) {
            model.addAttribute("products", products);
            return "/product/list";
        }else {
            model.addAttribute("message","loi");
            return "/product/error";
        }
    }
}
