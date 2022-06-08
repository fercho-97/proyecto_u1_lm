package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface ITransferenciaService {
	
	public void realizarTransferncia (String ctaOrigen,String ctaDestino, BigDecimal monto);

}
