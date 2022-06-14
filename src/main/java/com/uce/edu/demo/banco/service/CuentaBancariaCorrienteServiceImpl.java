package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteServiceImpl implements ICuentaBancariaService {


	@Override
	public void insertarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public CuentaBancaria buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarCuenta(String numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		// codigo duplicado se solucioan con una fachada
		// CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);

		BigDecimal interes = saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));

		return interes;
	}

}
