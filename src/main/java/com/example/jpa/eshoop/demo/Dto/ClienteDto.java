package com.example.jpa.eshoop.demo.Dto;

import lombok.Data;

@Data
public class ClienteDto {
    private Long id;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;

    
    public ClienteDto(Long id, String nombre, String email, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }



    
}
