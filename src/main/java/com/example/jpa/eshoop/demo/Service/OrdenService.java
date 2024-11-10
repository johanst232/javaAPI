package com.example.jpa.eshoop.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpa.eshoop.demo.Repository.OrdenRepository;
import com.example.jpa.eshoop.demo.model.Orden;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    

    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenRepository.findAll();
    }
    public Orden obtenerOrdenPorId(Long id) {
    return ordenRepository.findById(id).orElse(null);
}

public List<Orden> obtenerOrdenesPorCliente(Long idCliente) {
    return ordenRepository.findByClienteId(idCliente);
}

    public Orden crearOrden(Orden orden) {
        return ordenRepository.save(orden);
    }
}


