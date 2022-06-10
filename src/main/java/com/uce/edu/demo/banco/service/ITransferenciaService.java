package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia (String ctaOrigen,String ctaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(String ctaOrigen);
	
	public void actualizarTransferencia (String numeroCuentaOrigen);
	
	public void borrarTransferencia(String ctaOrigen);

}
