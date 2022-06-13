package com.uce.edu.demo.santamaria.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(List<Producto> productos) {
		// TODO Auto-generated method stub
		// aqui se inserta en la bd
		System.out.println("Aqui se inserta el inventario: " + productos);
	}

	@Override
	public Inventario buscar(String nombreInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el inventario por fecha de creacion de inventario: " + nombreInventario);
		Inventario i = new Inventario();
		i.setNombreInventario(nombreInventario);
		return i;
	}

	@Override
	public void actualizar(List<Producto> productos) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el inventario: " + productos);

	}

	@Override
	public void borrar(String nombreInventario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el inventario: " + nombreInventario);

	}

}
