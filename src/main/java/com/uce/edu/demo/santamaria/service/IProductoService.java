package com.uce.edu.demo.santamaria.service;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoService {

	public void ingresarProducto(Producto p);
	
	public Producto buscarProducto(String nombreProducto);
	
	public void actualizarProducto(Producto p);
	
	public void borrarProducto (String nombre);
}
