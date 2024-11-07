package com.eshop.clothes.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.clothes.model.Productos;
import com.eshop.clothes.repository.ProductosRepository;
@Service
public class ProductoService {
@Autowired
    private ProductosRepository productosRepository;

    public List<Productos> obtenerTodosLosProductos() {
        return productosRepository.findAll();
    }

    public Productos obtenerProductoPorId(Long id) {
        return productosRepository.findById(id).orElse(null);
    }

    public Productos guardarProducto(Productos productos) {
        return productosRepository.save(productos);
    }

    public Productos actualizarProducto(Long id, Productos productoActualizado) {
        Productos productos = obtenerProductoPorId(id);
        if (productos != null) {
            productos.setNombre(productoActualizado.getNombre());
            productos.setDescripcion(productoActualizado.getDescripcion());
            productos.setTalla(productoActualizado.getTalla());
            productos.setColor(productoActualizado.getColor());
            productos.setPrecio(productoActualizado.getPrecio());
            productos.setStock(productoActualizado.getStock());
            return productosRepository.save(productos);
        }
        return null;
    }

    public void eliminarProducto(Long id) {
        productosRepository.deleteById(id);
    }
}
