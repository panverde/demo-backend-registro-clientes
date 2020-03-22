package com.inter.service;

import java.util.List;

import com.inter.dto.response.ClientesResponse;
import com.inter.dto.response.KpiClientes;
import com.inter.model.Cliente;

public interface IClienteService {

	List<Cliente> findAll();
	
	Cliente create(Cliente cliente);
	
	KpiClientes kpiClientes();
	
	List<ClientesResponse> listarClientes();
	
	
}
