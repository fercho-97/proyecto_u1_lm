package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private String numeroCuentaOrigen;
	private String numeroTransaccion;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;

	@Override
	public String toString() {
		return "Retiro [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino=" + ", numeroTransaccion="
				+ numeroTransaccion + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + "]";
	}

	// SET Y GET
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}

	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public String getNumeroTransaccion() {
		return numeroTransaccion;
	}

	public void setNumeroTransaccion(String numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}

	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}

	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}

	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

}
