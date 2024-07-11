package com.vadigaccesorios.vadig.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadigaccesorios.vadig.repository.IUsuarioRepository;
import com.vadigaccesorios.vadig.model.Clientes;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Clientes> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

}
