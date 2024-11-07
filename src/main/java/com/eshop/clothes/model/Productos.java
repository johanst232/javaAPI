package com.eshop.clothes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="Productos")
@Data
public class Productos {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String talla; 
    private String color;
    private double precio;
    private int stock;

    // Constructores, getters y setters
    public Productos() {}

    public Productos(String nombre, String descripcion, String talla, String color, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }
    
}
