package com.uce.edu.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}

	@Override
	public void insertarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(c);

	}

	@Override
	public void borrarCuenta(String numero) {
		// TODO Auto-generated method stub
		this.bancariaRepository.borrar(numero);

	}

}
