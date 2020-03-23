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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "ClienteController", description = "API demo clientes")
@RestController
@RequestMapping("/v1")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@ApiOperation(value = "crear nuevo cliente")
	@PostMapping(value = "/creacliente")
	public void createCliente(@RequestBody @Valid Cliente cliente) {
		service.create(cliente);
	}
	
	@ApiOperation(value = "consultar kpi de clientes", response = KpiClientes.class )
	@GetMapping(value = "/kpideclientes")
	public KpiClientes kpiClientes() {
		return service.kpiClientes();
	}
	
	@ApiOperation(value = "consultar lista de clientes", response = ClientesResponse.class)
	@GetMapping(value = "/listclientes")
	public List<ClientesResponse> listarClientes() {
		return service.listarClientes();
	}
	

}
