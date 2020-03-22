package com.inter.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inter.dto.response.ClientesResponse;
import com.inter.dto.response.KpiClientes;
import com.inter.model.Cliente;
import com.inter.service.IClienteService;

@RestController
@RequestMapping("/v1")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@PostMapping(value = "/creacliente")
	public void createCliente(@RequestBody @Valid Cliente cliente) {
		service.create(cliente);
	}
	
	@GetMapping(value = "/kpideclientes")
	public KpiClientes kpiClientes() {
		return service.kpiClientes();
	}
	
	@GetMapping(value = "/listclientes")
	public List<ClientesResponse> listarClientes() {
		return service.listarClientes();
	}
	

}
