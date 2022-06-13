package com.uce.edu.demo.santamaria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.santamaria.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		// aqui se inserta en la bd
		System.out.println("Aqui se inserta el producto: " + p);
	}

	@Override
	public Producto buscar(String nombreProducto) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setNombre(nombreProducto);
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("se actuliza el producto en la base: " + p);

	}

	@Override
	public void borrar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el prodcuto: " + nombre);

	}

}
