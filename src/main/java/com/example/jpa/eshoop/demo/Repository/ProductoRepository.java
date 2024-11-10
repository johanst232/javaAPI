package com.example.jpa.eshoop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa.eshoop.demo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
