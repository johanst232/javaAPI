package com.example.jpa.eshoop.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.eshoop.demo.Service.CarritoService;
import com.example.jpa.eshoop.demo.model.Carrito;
import com.example.jpa.eshoop.demo.model.Producto;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/carrito")
public class CarritoController {
@Autowired
    private CarritoService carritoService;

    @GetMapping("/{clienteId}")
    public Carrito obtenerCarrito(@PathVariable Long clienteId) {
        return carritoService.obtenerCarrito(clienteId);
    }

    @PostMapping("/{clienteId}/productos")
    public Carrito agregarProductoAlCarrito(@PathVariable Long clienteId, @RequestBody Producto producto) {
        return carritoService.agregarProductoAlCarrito(clienteId, producto);
    }

    @PutMapping("/{clienteId}/productos/{productoId}")
    public Carrito actualizarCantidadProducto(@PathVariable Long clienteId, @PathVariable Long productoId, @RequestBody int cantidad) {
        return carritoService.actualizarCantidadProducto(clienteId, productoId, cantidad);
    }

    @DeleteMapping("/{clienteId}/productos/{productoId}")
    public ResponseEntity<Void> eliminarProductoDelCarrito(@PathVariable Long clienteId, @PathVariable Long productoId) {
        carritoService.eliminarProductoDelCarrito(clienteId, productoId);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> vaciarCarrito(@PathVariable Long clienteId) {
        carritoService.vaciarCarrito(clienteId);
        return ResponseEntity.noContent().build();
    }
}

