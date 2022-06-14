package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancariaService;
import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.service.IGestorInventarioService;
import com.uce.edu.demo.santamaria.service.IInventarioService;
import com.uce.edu.demo.santamaria.service.IProductoService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("ahorros")
	private IFachadaCuentaBancariaService bancaria;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		BigDecimal interes =this.bancaria.calcularInteres("1213");
		System.out.println(interes);
		
	}

}
