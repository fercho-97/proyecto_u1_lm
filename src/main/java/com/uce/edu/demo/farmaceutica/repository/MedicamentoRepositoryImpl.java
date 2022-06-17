package com.uce.edu.demo.farmaceutica.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.farmaceutica.modelo.Medicamento;

@Repository
public class MedicamentoRepositoryImpl implements IMedicamentoRepository{

	@Override
	public void insertar(Medicamento m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el medicamento: " + m);
	}

	@Override
	public Medicamento buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el medicamento: " + nombre);
		Medicamento m = new Medicamento();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Medicamento m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el medicamento: " + m);
	}

	@Override
	public void borrar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el medicamento: " + nombre);
	}

}
