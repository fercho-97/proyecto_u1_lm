package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		// Aqui hay que construir los SQL's
		System.out.println("Cuenta Bancaria Actualziada a " + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca la cuenta bancaria: " + numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("A");
		return cta;
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		// aqui se hace la insercion en la base de datos
		System.out.println("Se ha insertado en la base la Cuenta Bancaria: " + c);

	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la cuenta: " + numero);

	}

}
