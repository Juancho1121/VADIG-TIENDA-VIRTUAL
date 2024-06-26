package com.vadigaccesorios.vadig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vadigaccesorios.vadig.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
