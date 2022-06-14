package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iBancariaService;

	@Autowired
	private IDepositoRepository iDepositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria ctaDestino = this.iBancariaService.buscarCuenta(numeroCtaDestino);
		BigDecimal saldoCtdestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtdestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.iBancariaService.actualizarCuenta(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.iDepositoRepository.insertarDeposito(deposito);

	}

	@Override
	public Deposito buscarDeposito(String ctaDestino) {
		// TODO Auto-generated method stub
		return this.iDepositoRepository.buscar(ctaDestino);
	}

	@Override
	public void actualizarDeposito(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		this.iDepositoRepository.actualizar(numeroCuentaDestino);
	}

	@Override
	public void borrarDeposito(String ctaDestino) {
		// TODO Auto-generated method stub
		this.iDepositoRepository.borrar(ctaDestino);
	}

}
