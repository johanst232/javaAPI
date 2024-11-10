package com.example.jpa.eshoop.demo.model;

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
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name="carrito")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder 
public class Carrito {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @OneToMany
    private List<Producto> producto;

    // Constructores

    public Carrito(Cliente cliente, List<Producto> producto) {
        this.cliente = cliente;
        this.producto = producto;
    }
}
