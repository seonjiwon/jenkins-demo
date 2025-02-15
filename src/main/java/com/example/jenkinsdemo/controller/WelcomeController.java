package com.example.jenkinsdemo.controller;

import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model) {
        log.info("Welcome to seonjiwon.com");

        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());

        return "index"; // resources/templates/index.html을 렌더링
    }

    private String getMessage() {
        return "Hi, there";
    }
}
