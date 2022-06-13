package com.uce.edu.demo.santamaria.service;

import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IInventarioService {

	public void insertarInventario(List<Producto> productos);

	public Inventario buscarInventario(String nombreInventario);

	public void actualizarInventario(List<Producto> productos);

	public void borrarInventario(String nombreInventario);
}
