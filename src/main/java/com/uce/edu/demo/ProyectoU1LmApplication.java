package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		this.iTransferenciaService.realizarTransferncia("12", "13", new BigDecimal(20));

		this.iDepositoService.realizarDeposito("14", new BigDecimal(50));
	}

}
