package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void insertarMateria(Materia m);

	public Materia buscarNombre(String nombre);

	public void actualizarMateria(Materia m);

	public void borrarMateria(String nombre);

}
