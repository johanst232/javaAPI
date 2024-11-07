package com.eshop.clothes.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.experimental.SuperBuilder;
@Entity
@Table(name="Carrito")
@Data
@AllArgsConstructor
@SuperBuilder
public class Carrito {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @OneToMany
    private List<Productos> productos;

    // Constructores
    public Carrito() {}

    public Carrito(Cliente cliente, List<Productos> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }
    
}
