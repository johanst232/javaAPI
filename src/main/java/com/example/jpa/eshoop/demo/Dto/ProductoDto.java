package com.example.jpa.eshoop.demo.Dto;

import lombok.Data;

@Data
public class ProductoDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String talla; 
    private String color;
    private double precio;
    private int stock;
    
    public ProductoDto(Long id, String nombre, String descripcion, String talla, String color, double precio,
            int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    

    
}
