package com.vadigaccesorios.vadig.service;


import java.util.Optional;

import com.vadigaccesorios.vadig.model.Clientes;


public interface IUsuarioService {
	
	Optional<Clientes> findById(Integer id);

}
