package com.example.controller;

import com.example.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;
    @GetMapping(value = {"/","/dictionary"})
    public String dictionary(){
        return "dictionary";
    }
    @PostMapping(value = "dictionary")
    public String result(@RequestParam String en, Model model){
      String vn=  iDictionaryService.dictionary(en);
      if(vn==null){
          model.addAttribute("error","Khong tim thay");
      }else {
          model.addAttribute("vn", vn);
          model.addAttribute("en", en);
      }
      return "dictionary";
    }
}
