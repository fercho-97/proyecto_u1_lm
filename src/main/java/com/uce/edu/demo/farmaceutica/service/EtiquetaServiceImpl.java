package com.uce.edu.demo.farmaceutica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.farmaceutica.modelo.Empresa;
import com.uce.edu.demo.farmaceutica.modelo.Etiqueta;
import com.uce.edu.demo.farmaceutica.repository.IEtiquetaRepository;

@Service
public class EtiquetaServiceImpl implements IEtiquetaService{

	
	@Autowired
	private IEtiquetaRepository iEtiquetaRepository;
	
	@Autowired
	private Empresa empresa;
	

	
	@Override
	public void insertarEtiqueta(Etiqueta et) {
		// TODO Auto-generated method stub
		System.out.println("DI desde service SINGLETON "+ this.empresa);
		this.iEtiquetaRepository.insertar(et);
	}

	@Override
	public Etiqueta buscarEtiqueta(String id) {
		// TODO Auto-generated method stub
		return this.iEtiquetaRepository.buscar(id);
	}

	@Override
	public void actualizarEtiqueta(Etiqueta et) {
		// TODO Auto-generated method stub
		this.iEtiquetaRepository.actualizar(et);
	}

	@Override
	public void borrarEtiqueta(String id) {
		// TODO Auto-generated method stub
		this.iEtiquetaRepository.borrar(id);
	}

}
