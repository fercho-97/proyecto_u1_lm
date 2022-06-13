package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.to.TransaccionTo;

public interface ITransaccionService {

	public void transferecia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);

	public void deposito(String cuentaDestino, BigDecimal monto);

	public void retiro(String cuentaOrigen, BigDecimal monto);

	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
