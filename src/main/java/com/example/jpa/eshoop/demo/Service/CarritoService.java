package com.example.jpa.eshoop.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.jpa.eshoop.demo.Repository.CarritoProductoRepository;
import com.example.jpa.eshoop.demo.Repository.CarritoRepository;
import com.example.jpa.eshoop.demo.Repository.ProductoRepository;
import com.example.jpa.eshoop.demo.model.Carrito;
import com.example.jpa.eshoop.demo.model.CarritoProducto;
import com.example.jpa.eshoop.demo.model.Producto;

@Service
public class CarritoService {
    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CarritoProductoRepository carritoProductoRepository;

    public Carrito obtenerCarrito(Long clienteId) {
        return carritoRepository.findByClienteId(clienteId)
                .orElseGet(() -> {
                    Carrito nuevoCarrito = new Carrito();
                    nuevoCarrito.setClienteId(clienteId);
                    return carritoRepository.save(nuevoCarrito);
                });
    }

    public Carrito agregarProductoAlCarrito(Long clienteId, Producto producto) {
        Carrito carrito = obtenerCarrito(clienteId);
        Producto productoExistente = productoRepository.findById(producto.getId())
                .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

        CarritoProducto carritoProducto = carritoProductoRepository.findByCarritoAndProducto(carrito, productoExistente)
                .orElse(new CarritoProducto());

        carritoProducto.setCarrito(carrito);
        carritoProducto.setProducto(productoExistente);
        carritoProducto.setCantidad(carritoProducto.getCantidad() + 1);

        carritoProductoRepository.save(carritoProducto);
        carrito.getProductos().add(carritoProducto);

        return carritoRepository.save(carrito);
    }

    public Carrito actualizarCantidadProducto(Long clienteId, Long productoId, int cantidad) {
        Carrito carrito = obtenerCarrito(clienteId);
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

        CarritoProducto carritoProducto = carritoProductoRepository.findByCarritoAndProducto(carrito, producto)
                .orElseThrow(() -> new IllegalArgumentException("Producto no está en el carrito"));

        carritoProducto.setCantidad(cantidad);
        carritoProductoRepository.save(carritoProducto);

        return carritoRepository.save(carrito);
    }

    public void eliminarProductoDelCarrito(Long clienteId, Long productoId) {
        Carrito carrito = obtenerCarrito(clienteId);
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

        CarritoProducto carritoProducto = carritoProductoRepository.findByCarritoAndProducto(carrito, producto)
                .orElseThrow(() -> new IllegalArgumentException("Producto no está en el carrito"));

        carritoProductoRepository.delete(carritoProducto);
    }

    public void vaciarCarrito(Long clienteId) {
        Carrito carrito = obtenerCarrito(clienteId);
        carrito.getProductos().clear();
        carritoRepository.save(carrito);
    }
}
