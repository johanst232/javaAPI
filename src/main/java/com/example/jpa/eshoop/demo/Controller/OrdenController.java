package com.example.jpa.eshoop.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.eshoop.demo.Service.OrdenService;
import com.example.jpa.eshoop.demo.model.Orden;
@RestController
@RequestMapping("/ordenes")
public class OrdenController {
@Autowired
    private OrdenService ordenService;

    @GetMapping
    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenService.obtenerTodasLasOrdenes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orden> obtenerOrdenPorId(@PathVariable Long id) {
        Orden orden = ordenService.obtenerOrdenPorId(id);
        return ResponseEntity.ok(orden);
    }

    @PostMapping("/create")
    public Orden crearOrden(@RequestBody Orden orden) {
        return ordenService.crearOrden(orden);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Orden> obtenerOrdenesPorCliente(@PathVariable Long clienteId) {
        return ordenService.obtenerOrdenesPorCliente(clienteId);
    }
}
