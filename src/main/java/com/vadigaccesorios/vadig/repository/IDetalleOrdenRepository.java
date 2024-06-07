package com.vadigaccesorios.vadig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.vadigaccesorios.vadig.model.DetallePedido;

@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetallePedido, Integer> {

}
