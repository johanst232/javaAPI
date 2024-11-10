package com.example.jpa.eshoop.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.eshoop.demo.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository <Carrito,Long> {
    Optional<Carrito> findByClienteId(Long clienteId);
}
