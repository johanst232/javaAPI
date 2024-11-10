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
@Table(name="producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String talla; 
    private String color;
    private double precio;
    private int stock;


    public Producto(String nombre, String descripcion, String talla, String color, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }
    

}
