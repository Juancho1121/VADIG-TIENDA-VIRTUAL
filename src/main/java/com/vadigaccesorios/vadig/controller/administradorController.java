package com.vadigaccesorios.vadig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class administradorController {

        @GetMapping("")
        public String home() {
            return "administrador/home";

        }
}
