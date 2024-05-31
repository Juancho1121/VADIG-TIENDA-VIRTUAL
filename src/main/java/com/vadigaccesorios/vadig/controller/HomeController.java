package com.vadigaccesorios.vadig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vadigaccesorios.vadig.service.ProductoService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String home(Model model) {

        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }
}
