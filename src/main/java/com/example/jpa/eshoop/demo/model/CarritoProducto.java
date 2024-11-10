package com.example.jpa.eshoop.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="carrito_producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CarritoProducto {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Carrito carrito;
    @ManyToOne
    private Producto producto;
    @Column (name="CANTIDAD")
    private int cantidad;
}
