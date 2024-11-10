package com.example.jpa.eshoop.demo.Dto;

import java.util.List;

import com.example.jpa.eshoop.demo.model.Cliente;
import com.example.jpa.eshoop.demo.model.Producto;

import lombok.Data;


@Data
public class OrdenDto {

    private Long id;
    private double total;
    private Cliente cliente;
    private List<Producto> producto;
    
    public OrdenDto(Long id, double total, Cliente cliente, List<Producto> producto) {
        this.id = id;
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
    }




    
}
