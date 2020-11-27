package com.jyotirmayadas.scopes.controllers;

import com.jyotirmayadas.scopes.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //    private final RandomNumberService randomNumberService; // proxy CGLib based
    private final NumberService numberService; // proxy jdk based

    public IndexController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping
    public String indexAction(Model model) {
        model.addAttribute("message", numberService.getValue());
        return "index.html";
    }

}
