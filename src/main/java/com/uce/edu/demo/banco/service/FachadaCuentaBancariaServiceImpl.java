package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancariaService {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService iCuentaBancariaServiceC;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaServiceA;
	
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService iCuentaBancariaServiceF;
	

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;

	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub

		BigDecimal interes = null;
		CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);
		
		if (cta.getTipo().equals("A")) {
			// AHORROS
			interes = this.iCuentaBancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		} else if(cta.getTipo().equals("C")) {
			// CORRIENTE
			interes = this.iCuentaBancariaServiceC.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			// FUTURO	
			interes = this.iCuentaBancariaServiceF.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
