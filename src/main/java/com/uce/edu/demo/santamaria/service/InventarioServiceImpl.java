package com.uce.edu.demo.santamaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void insertarInventario(List<Producto> productos) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(productos);
		
	}

	@Override
	public Inventario buscarInventario(String nombreInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en el inventario con la fecha: " + nombreInventario);
		return this.iInventarioRepository.buscar(nombreInventario);
	}

	@Override
	public void actualizarInventario(List<Producto> productos) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(productos);
		
	}

	@Override
	public void borrarInventario(String nombreInventario) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.buscar(nombreInventario);
	}
	
	
	
}
