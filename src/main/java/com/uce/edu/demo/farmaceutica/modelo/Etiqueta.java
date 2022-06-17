package com.uce.edu.demo.farmaceutica.modelo;

import java.time.LocalDate;

public class Etiqueta {

	private String id;
	private Medicamento medicamento;
	private Empresa empresa;
	private LocalDate fechaElaboracion;
	
	@Override
	public String toString() {
		return "Etiqueta [id=" + id + ", medicamento=" + medicamento + ", empresa=" + empresa + ", fechaElaboracion="
				+ fechaElaboracion + "]";
	}
	
	//SET Y GET
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(LocalDate fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}

	
}
