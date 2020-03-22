package com.inter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "clientes")
@ApiModel("Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	@ApiModelProperty(value = "Nombres de cliente",required = true)
	@NotBlank(message = "Nombre es un caracter necesario")
	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;
	@ApiModelProperty(value = "Apellidos de cliente",required = true)
	@NotBlank(message = "Apellido es un caracter necesario")
	@Column(name = "apellidos", length = 50, nullable = false)
	private String apellidos;
	@ApiModelProperty(value = "Edad de cliente",required = true)
	@Column(name = "edad")
	@NotNull
	private Integer edad;
	@ApiModelProperty(value = "Fecha de nacimiento de cliente",required = true)
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "fecha_nacimiento", length = 50, nullable = false)
	private Date fecha_nacimiento;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
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

	
	
	
}
