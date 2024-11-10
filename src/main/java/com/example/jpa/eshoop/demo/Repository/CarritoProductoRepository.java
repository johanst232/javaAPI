package com.example.jpa.eshoop.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.eshoop.demo.model.Carrito;
import com.example.jpa.eshoop.demo.model.CarritoProducto;
import com.example.jpa.eshoop.demo.model.Producto;

public interface CarritoProductoRepository extends JpaRepository <CarritoProducto,Long>{
Optional<CarritoProducto> findByCarritoAndProducto(Carrito carrito, Producto producto);
}
