package com.example.jpa.eshoop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.eshoop.demo.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository <Carrito,Long> {

}
