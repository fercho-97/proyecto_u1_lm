package com.uce.edu.demo.farmaceutica.service;

import com.uce.edu.demo.farmaceutica.modelo.Medicamento;

public interface IMedicamentoService {
	
	public void insertarMedicamento(Medicamento m);

	public Medicamento buscarMedicamento(String nombre);

	public void actualizarMedicamento(Medicamento m);

	public void borrarMedicamento(String nombre);

}
