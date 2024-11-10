package com.example.jpa.eshoop.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="orden")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Orden {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double total;

@ManyToOne
    private Cliente cliente;

@OneToMany 
    private List<Producto> producto;

}
