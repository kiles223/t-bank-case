package com.example.tbankcase.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Bank Case");
        return "index";
    }
}
