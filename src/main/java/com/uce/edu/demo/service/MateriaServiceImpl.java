package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	IMateriaRepository materiaRepository;

	@Override
	public void insertarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(m);
	}

	@Override
	public Materia buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(m);

	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepository.borrar(nombre);
	}

}
