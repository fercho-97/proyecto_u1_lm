package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde service SINGLETON "+ this.profesorGeneral);
		System.out.println("DI desde service PROTOTYPE "+ this.profesorMateria);
		
		this.iMatriculaRepository.insertar(m);

	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(m);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.borrar(numero);
	}

}
