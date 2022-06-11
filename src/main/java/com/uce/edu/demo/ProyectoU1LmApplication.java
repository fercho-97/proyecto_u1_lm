package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	@Autowired
	private IRetiroService iRetiroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("TRANSFERENCIA-------");
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		this.iTransferenciaService.actualizarTransferencia("15");
		this.iTransferenciaService.buscarTransferencia("15");
		this.iTransferenciaService.borrarTransferencia("15");

		System.out.println("DEPOSITO-------");
		this.iDepositoService.realizarDeposito("14", new BigDecimal(50));
		this.iDepositoService.actualizarDeposito("14");
		this.iDepositoService.borrarDeposito("14");
		this.iDepositoService.buscarDeposito("14");

		System.out.println("RETIRO-------");
		this.iRetiroService.realizarRetiro("15", new BigDecimal(30));
		this.iRetiroService.actualizarRetiro("15");
		this.iRetiroService.buscarRetiro("15");
		this.iRetiroService.borrarRetiro("15");

	}

}
