package com.vadigaccesorios.vadig.service;

import java.util.List;
import java.util.Optional;

import com.vadigaccesorios.vadig.model.carrito;
import com.vadigaccesorios.vadig.model.Clientes;

public interface IOrdenService {
	List<carrito> findAll();
	Optional<carrito> findById(Integer id);
	carrito save (carrito orden);
	String generarNumeroOrden();
	List<carrito> findByUsuario (Clientes usuario);
}
