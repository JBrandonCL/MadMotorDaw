package com.madmotor.apimadmotordaw.rest.clientes.Repository;

import com.madmotor.apimadmotordaw.rest.clientes.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> , JpaSpecificationExecutor<Cliente> {


    //Metodo para guardar un cliente pasandolo un objeto de tipo Cliente para el metodo POST y Put en el caso de Spring tambien actualiza
    Cliente save(Cliente cliente);
    //Metodo para encontrar un cliente mediante su dni asi como otra manera de filtrar en el caso de que se necesite

    Optional<Cliente>findByDniEqualsIgnoreCase(String dni);

}
