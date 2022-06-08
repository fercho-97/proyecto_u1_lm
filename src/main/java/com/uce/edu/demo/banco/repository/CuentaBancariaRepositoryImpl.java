package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		//Aqui hay que construir los SQL's
		System.out.println("Cuenta Bancaria Actualziada a " + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se busca la cuenta bancaria: " + numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}

}
