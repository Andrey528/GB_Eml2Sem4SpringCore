package com.example.GB_Eml2Sem4SpringCore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class RndController {
    @GetMapping("/random") // передача через параметры http://localhost:8080/random?min=20&max=80
    public String getRngNumberPage(@RequestParam(name = "min") int min, @RequestParam(name = "max") int max, Model model) {
        int randomInt = new Random().nextInt(min, max + 1);
        model.addAttribute("number", randomInt);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "random";
    }

    @GetMapping("/random/{min}/{max}") // передача через путь http://localhost:8080/random/20/80
    public String getFromPathRngNumberPage(@PathVariable(name = "min") int min, @PathVariable(name = "max") int max, Model model) {
        int randomInt = new Random().nextInt(min, max + 1);
        model.addAttribute("number", randomInt);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "random";
    }
}
