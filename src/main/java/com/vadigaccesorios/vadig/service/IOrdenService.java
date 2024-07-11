package com.vadigaccesorios.vadig.service;

import java.util.List;

import com.vadigaccesorios.vadig.model.carrito;

public interface IOrdenService {
	List<carrito> findAll();

	carrito save(carrito orden);

	String generarNumeroOrden();
}
