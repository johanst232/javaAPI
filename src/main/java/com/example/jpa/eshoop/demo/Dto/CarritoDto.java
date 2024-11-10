package com.example.jpa.eshoop.demo.Dto;

import java.util.List;

import com.example.jpa.eshoop.demo.model.CarritoProducto;

import lombok.Data;

@Data
public class CarritoDto {
    private Long id;
    private Long clienteId;
    private List<CarritoProducto> productos;
    
    public CarritoDto(Long id, Long clienteId, List<CarritoProducto> productos) {
        this.id = id;
        this.clienteId = clienteId;
        this.productos = productos;
    }


   
}
