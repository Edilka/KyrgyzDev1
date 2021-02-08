package com.project.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiniControllers {
    @GetMapping("/vacancies")
    public String vacancies(Model model) {
        model.addAttribute("title", "Вакансии");
        return "vacancies";
    }
    @GetMapping("/team")
    public String team(Model model) {
        model.addAttribute("title", "Команда");
        return "team";
    }
}
