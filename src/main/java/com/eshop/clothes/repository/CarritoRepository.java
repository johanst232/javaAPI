package com.eshop.clothes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.clothes.model.Carrito;
@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}
