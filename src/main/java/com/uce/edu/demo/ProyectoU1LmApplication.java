package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tienda.Factura;
import com.uce.edu.demo.tienda.Factura2;
import com.uce.edu.demo.tienda.Factura3;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

//	//1) DI por atributo
//	@Autowired
//	private CitaMedica cita;

//	@Autowired
//	private CitaMedica2 cita;

	// 1) La clase Factura usa DI por atributo
	@Autowired
	private Factura documento;

	// 2) La clase Factura2 usa DI por constructor
	@Autowired
	private Factura2 documento2;

	// 3) La clase Factura3 usa DI por metodos SET
	@Autowired
	private Factura3 documento3;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		System.out.println("MI primer proyecto con SpringFramework");

//		String respuesta = cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//
//		System.out.println(respuesta);

		String emision = documento.facturacion(LocalDateTime.now(), "Pedro", "Alban", "1719662280", "refrigeradora",
				"electrodomestico", 250.5, 1);

		System.out.println(emision + "---DI por atributos");

		String emision2 = documento2.facturacion(LocalDateTime.now(), "Ignacio", "Cortez", "1712336679", "llantas",
				"automotriz", 85, 4);

		System.out.println(emision2 + "---DI por constructor");

		String emision3 = documento3.facturacion(LocalDateTime.now(), "Alejandra", "Guerrero", "0648751239", "muebles",
				"hogar", 40, 1);

		System.out.println(emision3 + "---DI por metodos SET");

	}

}
