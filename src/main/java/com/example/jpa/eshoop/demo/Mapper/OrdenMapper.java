package com.example.jpa.eshoop.demo.Mapper;

import org.springframework.stereotype.Component;
import com.example.jpa.eshoop.demo.Dto.OrdenDto;
import com.example.jpa.eshoop.demo.model.Orden;

@Component
public class OrdenMapper {
public OrdenDto toDTO(Orden orden){
if (orden==null){
    throw new IllegalArgumentException("El producto no debe ser nulo");
}
OrdenDto ordenDto = new OrdenDto(null, 0, null, null);
ordenDto.setId(orden.getId());
ordenDto.setTotal(orden.getTotal());
ordenDto.setCliente(orden.getCliente());
ordenDto.setProducto(orden.getProducto());


return ordenDto;
}
public Orden toEntity(OrdenDto ordenDto){
    if (ordenDto==null){
        throw new IllegalArgumentException("El producto no debe ser nulo");
    }
    Orden orden = new Orden();
    orden.setId(ordenDto.getId());
    orden.setTotal(ordenDto.getTotal());
    orden.setCliente(ordenDto.getCliente());
    orden.setProducto(ordenDto.getProducto());

    
    return orden;
}


}
