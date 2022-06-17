package com.uce.edu.demo.farmaceutica.repository;

import com.uce.edu.demo.farmaceutica.modelo.Medicamento;

public interface IMedicamentoRepository {

	public void insertar(Medicamento m);

	public Medicamento buscar(String nombre);

	public void actualizar(Medicamento m);

	public void borrar(String nombre);

}
