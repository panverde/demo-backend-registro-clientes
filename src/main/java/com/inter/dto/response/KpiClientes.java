package com.inter.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("KpiClientes")
public class KpiClientes {
	
	@ApiModelProperty(value = "Promedio de edades de clientes",required = true)
	private Double promedio;
	@ApiModelProperty(value = "Desviacion estandar de edades de clientes",required = true)
	private Double desviacion;
	

	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	public Double getDesviacion() {
		return desviacion;
	}
	public void setDesviacion(Double desviacion) {
		this.desviacion = desviacion;
	}
	
	

}
