package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.modelo.Estudiante;

public interface ICuentaBancariaRepository {
	
	public void insertar(CuentaBancaria c);
	
	public CuentaBancaria buscar(String numero);
	
	public void actualizar(CuentaBancaria c);

	public void borrar(String numero);

}
