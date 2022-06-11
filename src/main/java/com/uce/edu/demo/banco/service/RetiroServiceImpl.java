package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void realizarRetiro(String ctaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.iCuentaBancariaService.buscarCuenta(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.iCuentaBancariaService.actualizarCuenta(cOrigen);

		Retiro r = new Retiro();
		r.setNumeroCuentaOrigen(ctaOrigen);
		r.setMontoTransferir(monto);
		r.setFechaTransferencia(LocalDateTime.now());

		this.iRetiroRepository.insertar(r);
	}

	@Override
	public Retiro buscarRetiro(String ctaOrigen) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscar(ctaOrigen);
	}

	@Override
	public void actualizarRetiro(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizar(ctaOrigen);
	}

	@Override
	public void borrarRetiro(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.borrar(ctaOrigen);
	}

}
