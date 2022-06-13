package com.uce.edu.demo.santamaria.repository;

import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IInventarioRepository {

	public void insertar(List<Producto> productos);
	
	public Inventario buscar(String nombreInventario);
	
	public void actualizar(List<Producto> productos);
	
	public void borrar(String nombreInventario);
}
