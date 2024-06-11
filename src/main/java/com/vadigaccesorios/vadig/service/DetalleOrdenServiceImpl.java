package com.vadigaccesorios.vadig.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadigaccesorios.vadig.model.DetallePedido;
import com.vadigaccesorios.vadig.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetallePedido save(DetallePedido detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}
	

	

}
