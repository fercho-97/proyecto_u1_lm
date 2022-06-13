package com.uce.edu.demo.santamaria.repository;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto p);
	
	public Producto buscar(String nombreProducto);
	
	public void actualizar(Producto p);
	
	public void borrar (String nombre);
	
}
