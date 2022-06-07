package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

	// C: crear/insertar
	public void insertar(Materia m);

	// R: leer/buscar
	public Materia buscar(String nombre);

	// U: actualizar
	public void actualizar(Materia m);

	// D: eliminar
	public void borrar(String nombre);

}
