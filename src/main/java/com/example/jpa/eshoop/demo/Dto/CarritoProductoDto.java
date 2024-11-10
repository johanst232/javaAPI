package com.example.jpa.eshoop.demo.Dto;

import com.example.jpa.eshoop.demo.model.Carrito;
import com.example.jpa.eshoop.demo.model.Producto;
import lombok.Data;
@Data
public class CarritoProductoDto {

    private Long id;
    private Carrito carrito;
    private Producto producto;
    private int cantidad;

    public CarritoProductoDto( Carrito carrito, Producto producto, int cantidad) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    
}
