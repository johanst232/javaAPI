package com.example.jpa.eshoop.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpa.eshoop.demo.Repository.ProductoRepository;
import com.example.jpa.eshoop.demo.model.Producto;

@Service
public class ProductoService {
@Autowired
ProductoRepository ProductoRepository;



public List<Producto> obtenerTodosLosProductos() {
    return ProductoRepository.findAll();
}

public Producto obtenerProductoPorId(Long id) {
    return ProductoRepository.findById(id).orElse(null);
}

public Producto guardarProducto(Producto producto) {
    return ProductoRepository.save(producto);
}

public Producto actualizarProducto(Long id, Producto productoActualizado) {
    Producto producto = obtenerProductoPorId(id);
    if (producto != null) {
        producto.setNombre(productoActualizado.getNombre());
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setTalla(productoActualizado.getTalla());
        producto.setColor(productoActualizado.getColor());
        producto.setPrecio(productoActualizado.getPrecio());
        producto.setStock(productoActualizado.getStock());
        return ProductoRepository.save(producto);
    }
    return null;
}

public void eliminarProducto(Long id) {
    ProductoRepository.deleteById(id);
}



}
