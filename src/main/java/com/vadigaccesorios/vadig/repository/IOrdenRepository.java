package com.vadigaccesorios.vadig.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vadigaccesorios.vadig.model.Clientes;
import com.vadigaccesorios.vadig.model.carrito;




@Repository
public interface IOrdenRepository extends JpaRepository<carrito, Integer> {
	List<carrito> findByClientes (Clientes usuario);
}
