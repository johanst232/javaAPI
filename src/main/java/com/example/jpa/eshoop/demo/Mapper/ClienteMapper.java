package com.example.jpa.eshoop.demo.Mapper;

import org.springframework.stereotype.Component;
import com.example.jpa.eshoop.demo.Dto.ClienteDto;
import com.example.jpa.eshoop.demo.model.Cliente;
@Component
public class ClienteMapper {
public ClienteDto toDTO(Cliente cliente){
if (cliente==null){
    throw new IllegalArgumentException("El producto no debe ser nulo");
}
ClienteDto clienteDto = new ClienteDto(null, null, null, null, null);
clienteDto.setId(cliente.getId());
clienteDto.setNombre(cliente.getNombre());
clienteDto.setEmail(cliente.getEmail());
clienteDto.setDireccion(cliente.getDireccion());
clienteDto.setTelefono(cliente.getTelefono());

return clienteDto;
}
public Cliente toEntity(ClienteDto clienteDto){
    if (clienteDto==null){
        throw new IllegalArgumentException("El producto no debe ser nulo");
    }
    Cliente cliente = new Cliente(null, null, null, null, null);
    cliente.setId(clienteDto.getId());
    cliente.setNombre(clienteDto.getNombre());
    cliente.setEmail(clienteDto.getEmail());
    cliente.setDireccion(clienteDto.getDireccion());
    cliente.setTelefono(clienteDto.getTelefono());
    
    return cliente;
}


}
