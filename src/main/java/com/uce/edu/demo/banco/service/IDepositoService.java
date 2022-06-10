package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);

	public Deposito buscarDeposito(String ctaDestino);

	public void actualizarDeposito(String numeroCuentaDestino);

	public void borrarDeposito(String ctaDestino);
}
