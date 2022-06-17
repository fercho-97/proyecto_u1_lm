package com.uce.edu.demo.farmaceutica.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.farmaceutica.modelo.Etiqueta;

@Repository
public class EtiquetaRepositoryImpl implements IEtiquetaRepository{

	@Override
	public void insertar(Etiqueta et) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la etiqueta: " + et);
	}

	@Override
	public Etiqueta buscar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la etiqueta: " + id);
		Etiqueta et = new Etiqueta();
		et.setId(id);
		return null;
	}

	@Override
	public void actualizar(Etiqueta et) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la etiqueta: " + et);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la etiqueta: " + id);
	}

}
