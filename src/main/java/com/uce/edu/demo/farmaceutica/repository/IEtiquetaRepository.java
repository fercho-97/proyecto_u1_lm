package com.uce.edu.demo.farmaceutica.repository;

import com.uce.edu.demo.farmaceutica.modelo.Etiqueta;

public interface IEtiquetaRepository {

	public void insertar(Etiqueta et);

	public Etiqueta buscar(String id);

	public void actualizar(Etiqueta et);

	public void borrar(String id);
}
