package com.example.jpa.eshoop.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa.eshoop.demo.model.Orden;

@Repository
public interface OrdenRepository extends JpaRepository <Orden,Long>{
    List<Orden> findByClienteId(Long clienteId);
}
