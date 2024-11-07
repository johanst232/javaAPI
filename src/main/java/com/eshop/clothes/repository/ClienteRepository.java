package com.eshop.clothes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.clothes.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

