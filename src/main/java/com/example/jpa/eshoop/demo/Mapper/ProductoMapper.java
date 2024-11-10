package com.example.jpa.eshoop.demo.Mapper;

import org.springframework.stereotype.Component;

import com.example.jpa.eshoop.demo.Dto.ProductoDto;
import com.example.jpa.eshoop.demo.model.Producto;
@Component
public class ProductoMapper {
public ProductoDto toDTO(Producto producto){
if (producto==null){
    throw new IllegalArgumentException("El producto no debe ser nulo");
}
ProductoDto productoDto = new ProductoDto(null, null, null, null, null, 0, 0);
productoDto.setId(producto.getId());
productoDto.setNombre(producto.getNombre());
productoDto.setDescripcion(producto.getDescripcion());
productoDto.setTalla(producto.getTalla());
productoDto.setColor(producto.getColor());
productoDto.setPrecio(producto.getPrecio());
productoDto.setStock(producto.getStock());
return productoDto;
}
public Producto toEntity(ProductoDto productoDto){
    if (productoDto==null){
        throw new IllegalArgumentException("El productoDTO no debe ser nulo");
    }
    Producto producto = new Producto(null, null, null, null, null, 0, 0);
producto.setId(productoDto.getId());
producto.setNombre(productoDto.getNombre());
producto.setDescripcion(productoDto.getDescripcion());
producto.setTalla(productoDto.getTalla());
producto.setColor(productoDto.getColor());
producto.setPrecio(productoDto.getPrecio());
producto.setStock(productoDto.getStock());
return producto;
}
}
