package com.example.jpa.eshoop.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.eshoop.demo.Service.ProductoService;
import com.example.jpa.eshoop.demo.model.Producto;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	ProductoService ProductoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (Producto p: ProductoService.obtenerTodosLosProductos()){
			System.out.println(p);
		}
	}

}
