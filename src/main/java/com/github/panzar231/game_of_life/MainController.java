package com.github.panzar231.game_of_life;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final MessageGenerator messageGenerator;

    public MainController(MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", messageGenerator.getMessage());
        return "home";
    }
}
