package com.vadigaccesorios.vadig.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "ordenes")
public class carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;

    private double total;
    @ManyToOne
    private Clientes usuario;
    @OneToOne(mappedBy = "carrito")
    private DetallePedido detalle;


    public carrito() {

    }
    public carrito(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
  
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(java.util.Date fechaCreacion) {
        this.fechaCreacion = (Date) fechaCreacion;
    }
    

    public Date getFechaRecibida() {
        return fechaRecibida;
    }
    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

      public Clientes getUsuario() {
        return usuario;
    }
    public void setUsuario(Clientes usuario) {
        this.usuario = usuario;
    }
    public DetallePedido getDetalle() {
        return detalle;
    }
    public void setDetalle(DetallePedido detalle) {
        this.detalle = detalle;
    }
  
 @Override
    public String toString() {
        return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
                + fechaRecibida + ", total=" + total + "]";
    }

    

}
