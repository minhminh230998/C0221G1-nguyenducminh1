package com.example.controller;

import com.example.model.entity.Book;
import com.example.model.entity.Borrow;
import com.example.model.repository.BorrowRepository;
import com.example.model.service.AmountException;
import com.example.model.service.IBookService;
import com.example.model.service.IBorrowService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.Random;

@Controller
public class BorrowController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IBorrowService iBorrowService;

    @GetMapping(value = "/list_book")
    public String showListBook(Model model) {
        model.addAttribute("listBook", iBookService.findAll());
        return "list_book";
    }

    @GetMapping(value = "show-book")
    public String showBook(@RequestParam int id, Model model) throws AmountException {

        Book book = iBookService.findById(id);
        if(book.getAmount()==0){
                throw new AmountException();
        }
        book.setAmount(book.getAmount() - 1);
        iBookService.save(book);
        int code = iBorrowService.getRandom();
        Borrow borrow = new Borrow(code, book);
        iBorrowService.save(borrow);
        model.addAttribute("borrow", borrow);
        model.addAttribute("book", book);
        return "/show_book";
    }



    @ExceptionHandler(AmountException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("/error");
    }
    @GetMapping(value = "/delete_borrows")
    public String formDeleteBorrow() {
        return "delete_borrow";
    }
    @GetMapping (value = "/delete")
    public String deleteBorrow(@RequestParam int code)  {
        Borrow borrow=iBorrowService.findByCode(code);
        Book book=borrow.getBook();
        book.setAmount(book.getAmount()+1);
        iBorrowService.delete(code);

        iBookService.save(book);
        return "/home";
    }

}
