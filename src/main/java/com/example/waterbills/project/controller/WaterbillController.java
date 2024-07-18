package com.example.waterbills.project.controller;


import com.example.waterbills.project.model.Waterbill;
import com.example.waterbills.project.service.WaterbillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class WaterbillController {
    @Autowired
    private WaterbillServiceImpl waterbillService;

    @PostMapping("/newUser")
    public String saveUser(@RequestBody Waterbill user){
        waterbillService.saving(user);
        return "user";
    }




}