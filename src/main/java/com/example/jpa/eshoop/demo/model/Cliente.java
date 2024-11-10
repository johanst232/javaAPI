package com.example.jpa.eshoop.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cliente {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;

}
