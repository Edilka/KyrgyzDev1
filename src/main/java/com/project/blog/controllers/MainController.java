package com.project.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("title", "Главная страница");
        return "main";
    }
    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("title", "Новости");
        return "news";
    }
    @GetMapping("/work")
    public String pult(Model model) {
        model.addAttribute("title", "Биржа Труда");
        return "work";
    }

    @GetMapping("/reit")
    public String reit(Model model) {
        model.addAttribute("title", "Рейтинг");
        return "reit";
    }
    @GetMapping("/companies")
    public String companies(Model model) {
        model.addAttribute("title", "Компании");
        return "companies";
    }

}