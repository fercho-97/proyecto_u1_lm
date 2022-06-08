package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	private ICuentaBancariaService iBancariaService;

	@Autowired
	private IDepositoRepository iDepositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub

		CuentaBancaria ctaDestino = this.iBancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtdestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtdestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.iBancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.iDepositoRepository.insertarDeposito(deposito);

	}

}
