package com.inter.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.inter.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

	@Transactional
	@Query(value = "SELECT SUM (edad) FROM clientes", nativeQuery = true)
	Double sumaEdades();
	
	@Transactional
	@Query(value = "SELECT edad FROM clientes", nativeQuery = true)
	List<Integer> listaEdades();
	
}
