package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria cOrigen = this.bancariaService.buscarCuenta(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizarCuenta(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscarCuenta(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizarCuenta(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());

		this.iTransferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscarTransferencia(String ctaOrigen) {
		// TODO Auto-generated method stub

		return this.iTransferenciaRepository.buscar(ctaOrigen);
	}

	@Override
	public void actualizarTransferencia(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub

		this.iTransferenciaRepository.actualizar(numeroCuentaOrigen);
	}

	@Override
	public void borrarTransferencia(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub

		this.iTransferenciaRepository.borrar(numeroCuentaOrigen);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		// no deberia ir
		return this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaRetiro);
	}

}
