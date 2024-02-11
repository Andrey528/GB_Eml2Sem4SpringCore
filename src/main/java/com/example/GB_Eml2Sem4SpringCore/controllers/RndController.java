package com.example.GB_Eml2Sem4SpringCore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class RndController {
    @GetMapping("/random")
    public String getRngNumberPage(Model model) {
        int randomInt = new Random().nextInt(1, 101);
        model.addAttribute("number", randomInt);
        return "random";
    }
}
