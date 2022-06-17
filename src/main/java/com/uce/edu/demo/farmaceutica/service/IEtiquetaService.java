package com.uce.edu.demo.farmaceutica.service;

import com.uce.edu.demo.farmaceutica.modelo.Etiqueta;

public interface IEtiquetaService {

	public void insertarEtiqueta(Etiqueta et);

	public Etiqueta buscarEtiqueta(String id);

	public void actualizarEtiqueta(Etiqueta et);

	public void borrarEtiqueta(String id);
}
