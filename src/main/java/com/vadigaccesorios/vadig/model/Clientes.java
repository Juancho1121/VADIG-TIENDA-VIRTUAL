package com.vadigaccesorios.vadig.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name =  "clientes")
public class Clientes {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;
    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    private List<carrito> ordenes;



    public Clientes() {    
    }

    public Clientes(Integer id, String nombre, String username, String email, String direccion, String telefono,
            String tipo, String password) {
        this.id = id;
        Nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Clientes [id=" + id + ", Nombre=" + Nombre + ", username=" + username + ", email=" + email
                + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    
}
