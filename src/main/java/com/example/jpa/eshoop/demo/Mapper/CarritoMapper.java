package com.example.jpa.eshoop.demo.Mapper;

import org.springframework.stereotype.Component;
import com.example.jpa.eshoop.demo.Dto.CarritoDto;
import com.example.jpa.eshoop.demo.model.Carrito;

@Component
public class CarritoMapper {
public CarritoDto toDTO(Carrito carrito){
if (carrito==null){
    throw new IllegalArgumentException("El producto no debe ser nulo");
}
CarritoDto carritoDto = new CarritoDto(null, null, null);
carritoDto.setId(carrito.getId());
carritoDto.setClienteId(carrito.getClienteId());
carritoDto.setProductos(carrito.getProductos());

return carritoDto;
}
public Carrito toEntity(CarritoDto carritoDto){
    if (carritoDto==null){
        throw new IllegalArgumentException("El productoDTO no debe ser nulo");
    }
    Carrito carrito = new Carrito();
carrito.setId(carritoDto.getId());
carrito.setClienteId(carritoDto.getClienteId());
carrito.setProductos(carritoDto.getProductos());

return carrito;
}
}
