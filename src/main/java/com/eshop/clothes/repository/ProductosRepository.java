package com.eshop.clothes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.clothes.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
}

