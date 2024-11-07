package com.eshop.clothes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshop.clothes.model.Orden;
@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {
}