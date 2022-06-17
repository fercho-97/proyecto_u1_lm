package com.uce.edu.demo.farmaceutica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.farmaceutica.modelo.Medicamento;
import com.uce.edu.demo.farmaceutica.repository.IMedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements IMedicamentoService{

	@Autowired
	private IMedicamentoRepository iMedicamentoRepository;
	
	
	@Override
	public void insertarMedicamento(Medicamento m) {
		// TODO Auto-generated method stub
		this.iMedicamentoRepository.insertar(m);
	}

	@Override
	public Medicamento buscarMedicamento(String nombre) {
		// TODO Auto-generated method stub
		return this.iMedicamentoRepository.buscar(nombre);
	}

	@Override
	public void actualizarMedicamento(Medicamento m) {
		// TODO Auto-generated method stub
		this.iMedicamentoRepository.actualizar(m);
	}

	@Override
	public void borrarMedicamento(String nombre) {
		// TODO Auto-generated method stub
		this.iMedicamentoRepository.borrar(nombre);
	}

}
