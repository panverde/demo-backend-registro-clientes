package com.inter.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.dto.response.ClientesResponse;
import com.inter.dto.response.KpiClientes;
import com.inter.model.Cliente;
import com.inter.repository.IClienteRepo;

@Service
public class IClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo repository;

	@Override
	public List<Cliente> findAll() {

		return repository.findAll();
	}

	@Override
	public Cliente create(Cliente cliente) {

		return repository.save(cliente);
	}

	@Override
	public KpiClientes kpiClientes() {

		double varianza = 0;
		double sumatoria = 0;
		double desviacion = 0;
		double media = 0;

		KpiClientes kpi = new KpiClientes();
		List<Cliente> lisClientes = repository.findAll();

		// Calculo media
		media = repository.sumaEdades() / repository.count();
		// Calculo varianza
		for (Cliente cliente : lisClientes) {
			sumatoria = Math.pow(cliente.getEdad() - media, 2);
			varianza = varianza + sumatoria;
		}
		// Calculo varianza
		varianza = varianza / (repository.count() - 1);
		// Calculo desviacion
		desviacion = Math.sqrt(varianza);

		kpi.setPromedio(media);
		kpi.setDesviacion(desviacion);

		return kpi;
	}

	@Override
	public List<ClientesResponse> listarClientes() {
		
		int edad_esperanza = 76;
		Date fecha_muerte;
		
		List<Cliente> lisClientes = repository.findAll();
		List<ClientesResponse> listClientesResponse = null;
		
		if (lisClientes != null) {
			
			listClientesResponse = new ArrayList<ClientesResponse>();
			
			for (Cliente cliente : lisClientes) {
			
				ClientesResponse listClientesResponseLs = new ClientesResponse();
				
				listClientesResponseLs.setNombres(cliente.getNombres());
				listClientesResponseLs.setApellidos(cliente.getApellidos());
				listClientesResponseLs.setEdad(cliente.getEdad());
				listClientesResponseLs.setFecha_nacimiento(cliente.getFecha_nacimiento());				
				//años_vida = edad_esperanza - cliente.getEdad();			
				fecha_muerte = sumarAnios(cliente.getFecha_nacimiento(), edad_esperanza);
						//LocalDate.now() + años_vida;			
				listClientesResponseLs.setFecha_defuncion(fecha_muerte);
				
				listClientesResponse.add(listClientesResponseLs);			
			}		
		}
		
		return listClientesResponse;
	}

	
	public Date sumarAnios(Date fecha,int anios) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.YEAR,anios);
		
		return calendar.getTime();
	}
}
