package com.uce.edu.demo.santamaria.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private List<Producto> listaProductos;
	private String nombreInventario;
	private LocalDateTime fechaIngresoReporte;

	@Override
	public String toString() {
		return "Inventario [listaproductos=" + listaProductos + ", nombreInventario=" + nombreInventario
				+ ", fechaIngresoReporte=" + fechaIngresoReporte + "]";
	}

	// SET Y GET

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaproductos) {
		this.listaProductos = listaproductos;
	}

	public String getNombreInventario() {
		return nombreInventario;
	}

	public void setNombreInventario(String nombreInventario) {
		this.nombreInventario = nombreInventario;
	}

	public LocalDateTime getFechaIngresoReporte() {
		return fechaIngresoReporte;
	}

	public void setFechaIngresoReporte(LocalDateTime fechaIngresoReporte) {
		this.fechaIngresoReporte = fechaIngresoReporte;
	}

}
