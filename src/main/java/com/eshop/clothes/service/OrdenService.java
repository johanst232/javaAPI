package com.eshop.clothes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.clothes.model.Orden;
import com.eshop.clothes.repository.OrdenRepository;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;

    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenRepository.findAll();
    }

    public Orden crearOrden(Orden orden) {
        return ordenRepository.save(orden);
    }
}
