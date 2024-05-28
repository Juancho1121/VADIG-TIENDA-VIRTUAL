package com.vadigaccesorios.vadig.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vadigaccesorios.vadig.model.Clientes;
import com.vadigaccesorios.vadig.model.Producto;
import com.vadigaccesorios.vadig.service.ProductoService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;


    @GetMapping
    public String show() {
        return "productos/show";
    }
    @GetMapping("/create")
    public String create () {
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto) {
        LOGGER.info("Este es el objeto producto {}",producto);
        Clientes u= new Clientes(4,"","","","","","","");
        producto.setUsuario(u);
        productoService.save(producto);
        return"redirect:/productos";
    }

}
