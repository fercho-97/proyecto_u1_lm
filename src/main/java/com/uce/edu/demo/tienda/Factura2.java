package com.uce.edu.demo.tienda;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Factura2 {

	private Cliente cliente;
	private Producto producto;
	private int cantidad;
	private LocalDateTime fecha;

	public Factura2(Cliente cliente, Producto producto) { // instancia apartir de constructor
		// TODO Auto-generated constructor stub

		this.cliente = cliente;
		this.producto= producto;
	}

	public String facturacion(LocalDateTime fecha, String nombreCliente, String apellidoCliente, String ci,
			String nombreProducto, String tipo, double precio, int cantidad) {

		this.fecha = fecha;

		this.cliente.setNombre(nombreCliente);
		this.cliente.setApellido(apellidoCliente);
		this.cliente.setCi(ci);

		this.producto.setNombre(nombreProducto);
		this.producto.setTipo(tipo);
		this.producto.setPrecio(precio);
		this.producto.setCantidad(cantidad);

		// se inserta la cita en la base de datos

		return "Factura2 generada exitosamente";

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
