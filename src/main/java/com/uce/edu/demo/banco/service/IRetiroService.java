package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;


public interface IRetiroService {

	public void realizarRetiro (String ctaOrigen, BigDecimal monto, String numTransaccion);

	public Retiro buscarRetiro(String numeroTransaccion);
	
	public void actualizarRetiro (String numeroTransaccion);
	
	public void borrarRetiro(String numeroTransaccion);
}
