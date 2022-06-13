package com.uce.edu.demo.santamaria.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private int cantidad;
	private BigDecimal valorCompra;
	private BigDecimal valorVenta;
	private LocalDateTime fechaIngreso;

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", valorCompra=" + valorCompra
				+ ", valorVenta=" + valorVenta + ", fechaIngreso=" + fechaIngreso + "]";
	}

	// GET Y SET

	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public BigDecimal getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(BigDecimal valorventa) {
		this.valorVenta = valorventa;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
