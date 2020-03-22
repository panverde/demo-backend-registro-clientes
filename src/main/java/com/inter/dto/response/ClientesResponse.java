package com.inter.dto.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientesResponse {
	
	private String nombres;

	private String apellidos;

	private Integer edad;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_nacimiento;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_defuncion;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Date getFecha_defuncion() {
		return fecha_defuncion;
	}

	public void setFecha_defuncion(Date fecha_defuncion) {
		this.fecha_defuncion = fecha_defuncion;
	}


	
	

}
