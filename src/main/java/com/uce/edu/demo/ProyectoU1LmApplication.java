package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.farmaceutica.modelo.Empresa;
import com.uce.edu.demo.farmaceutica.modelo.Etiqueta;
import com.uce.edu.demo.farmaceutica.modelo.Medicamento;
import com.uce.edu.demo.farmaceutica.service.IEtiquetaService;
import com.uce.edu.demo.farmaceutica.service.IMedicamentoService;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private Empresa empresa1;

	@Autowired
	private Empresa empresa2;

	@Autowired
	private IMedicamentoService iMedicamentoService;

	@Autowired
	private IEtiquetaService iEtiquetaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("EJEMPLO SINGLETON");

		this.empresa1.setAutorizacion("1058");
		this.empresa1.setNombre("Cantabria Labs");
		System.out.println("Empresa1: " + empresa1);

		this.empresa2.setAutorizacion("999");
		this.empresa2.setNombre("BAGO");
		System.out.println("Empresa2: " + empresa2);

		System.out.println("Se crea una unica referencia de empresa");
		System.out.println("Empresa1: " + empresa1);
		

		System.out.println("EJEMPLO PROTOTYPE");

		Medicamento m1 = new Medicamento();
		m1.setNombre("aspirina");
		m1.setPrecio(new BigDecimal(10));
		m1.setTipo("salicilatos");
		this.iMedicamentoService.insertarMedicamento(m1);

		Etiqueta et1 = new Etiqueta();
		et1.setEmpresa(empresa1);
		et1.setMedicamento(m1);
		et1.setId("001");
		et1.setFechaElaboracion(LocalDate.of(2022, 01, 15));
		this.iEtiquetaService.insertarEtiqueta(et1);

		Medicamento m2 = new Medicamento();
		m2.setNombre("acnotin");
		m2.setPrecio(new BigDecimal(25));
		m2.setTipo("isotretinoina");
		this.iMedicamentoService.insertarMedicamento(m2);

		Etiqueta et2 = new Etiqueta();
		et2.setEmpresa(empresa2);
		et2.setMedicamento(m2);
		et2.setId("002");
		et2.setFechaElaboracion(LocalDate.of(2022, 02, 15));
		this.iEtiquetaService.insertarEtiqueta(et2);

		System.out.println("Se crea referencias independientes de medicamento");
	}

}
