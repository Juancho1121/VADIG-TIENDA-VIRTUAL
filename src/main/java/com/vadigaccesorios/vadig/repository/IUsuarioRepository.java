package com.vadigaccesorios.vadig.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vadigaccesorios.vadig.model.Clientes;

@Repository
public interface IUsuarioRepository extends JpaRepository<Clientes, Integer>{
	Optional<Clientes> findByEmail(String email);
}
