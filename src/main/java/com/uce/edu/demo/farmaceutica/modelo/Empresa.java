package com.uce.edu.demo.farmaceutica.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Empresa {

	private String nombre;
	private String autorizacion;

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", autorizacion=" + autorizacion + "]";
	}

	// SET Y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

}
