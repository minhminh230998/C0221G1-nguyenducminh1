package com.example.controller;

import com.example.model.entity.Comment;
import com.example.model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping({"", "/list"})
    public String goComment(Model model) {
        model.addAttribute("listComment", this.commentService.findAll());
        model.addAttribute("comments", new Comment());
        return "/comment";
    }

    @PostMapping("/create")
    public String createComment(@ModelAttribute Comment comment,
                                RedirectAttributes redirectAttributes) {
        this.commentService.save(comment);
        redirectAttributes.addFlashAttribute("messageSuccess", "Register successfully!");
        return "redirect:/list";
    }

    @GetMapping("/comment/like")
    public String editLike(@RequestParam int id) {
        commentService.edit(id);
        return "redirect:/list";
    }
}
