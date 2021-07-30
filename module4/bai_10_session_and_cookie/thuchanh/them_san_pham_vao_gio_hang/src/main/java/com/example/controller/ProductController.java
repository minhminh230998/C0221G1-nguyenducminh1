package com.example.controller;

import com.example.model.entity.Cart;
import com.example.model.entity.Product;
import com.example.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show2")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if (action.equals("show1")) {
            cart.removeOneProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping("/view/{id}")
    public String viewToCart(@PathVariable Long id, @ModelAttribute Cart cart, Model model) {
        Optional<Product> productOptional = productService.findById(id);
        model.addAttribute("product",productOptional.get());
        return "/view";
    }
    @GetMapping("/delete/{id}")
    public String removeToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
          cart.remove(productOptional.get());
        }
        return "redirect:/shop";
    }
    @GetMapping("/pay")
    public String payToCart(@ModelAttribute Cart cart,Model model) {
        model.addAttribute("total",cart.countTotalPayment());
        cart.clear();
        return "/pay";
    }
}
