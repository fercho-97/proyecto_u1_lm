package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;

	@Autowired
	private ProfesorGeneral profesorGeneral1;

	@Autowired
	private ProfesorMateria materia;

	@Autowired
	private ProfesorMateria materia1;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("EJEMPLO SINGLETON");
		this.profesorGeneral.setApellido("Guarnizo");
		this.profesorGeneral.setNombre("Juan");

		System.out.println(this.profesorGeneral);
		System.out.println("------");

		System.out.println(this.profesorGeneral1);
		System.out.println("------");
		this.profesorGeneral1.setNombre("Pepito");
		System.out.println(this.profesorGeneral);

		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");

		System.out.println(this.materia);

		System.out.println("------");

		System.out.println(this.materia1);

		Matricula matriucla1 = new Matricula();
		matriucla1.setEstudiante(new Estudiante());
		matriucla1.setMateria(new ArrayList<Materia>());
		matriucla1.setNumero("1234");

		this.iMatriculaService.insertar(matriucla1);

	}

}
