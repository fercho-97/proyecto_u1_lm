package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void insertar(Matricula m);

	public Matricula buscar(String nombre);

	public void actualizar(Matricula m);

	public void borrar(String nombre);

}
