package com.example.controller;

import com.example.model.entity.BenhNhan;
import com.example.model.service.IBenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping(value = "/patient")
@CrossOrigin
public class BenhNhanController {
    @Autowired
    IBenhNhanService iBenhNhanService;

    @GetMapping("/list")
    public ResponseEntity<List<BenhNhan>> list() {
        List<BenhNhan> benhNhans = iBenhNhanService.getAll();
        if (benhNhans.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(benhNhans, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id) {
        iBenhNhanService.delete(id);
    }


    @GetMapping("")
    public ResponseEntity<BenhNhan> get(@RequestParam Integer id) {
        BenhNhan benhNhan = iBenhNhanService.findById(id);
        return new ResponseEntity<>(benhNhan, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public void edit(@RequestParam Integer id, @RequestBody BenhNhan benhNhan) {
        BenhNhan bn = iBenhNhanService.findById(id);
        benhNhan.setId(bn.getId());
     iBenhNhanService.edit(benhNhan);
    }
}
