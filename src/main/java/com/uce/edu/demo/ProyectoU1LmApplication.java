package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1718191415");
		System.out.println("ESTUDIANTE----------");
		this.estudianteService.insertarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Juanito");
		e1.setApellido("Perez");
		e1.setCedula("0618759623");
		this.estudianteService.insertarEstudiante(e1);

		// Usar los 3 metodos restantes: actulizar borrar y buscar

		e.setCedula("1701020304");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarApellido("Perez");
		this.estudianteService.borrarEstudiante("1718191415");

		// Metodos de Materia

		Materia m = new Materia();
		m.setNombre("Programacion");
		m.setSemestre("QUINTO");
		System.out.println("MATERIA----------");
		this.materiaService.insertarMateria(m);

		Materia m1 = new Materia();
		m1.setNombre("Base de Datos");
		m1.setSemestre("SEXTO");
		this.materiaService.insertarMateria(m1);

		Materia m2 = new Materia();
		m2.setNombre("Analisis");
		m2.setSemestre("SEXTO");
		this.materiaService.insertarMateria(m2);

		m.setSemestre("SEXTO");
		this.materiaService.actualizarMateria(m);
		this.materiaService.buscarNombre("Progrmacion");
		this.materiaService.borrarMateria("Base de Datos");

		// Lista de materias
		List<Materia> curso1 = new ArrayList<Materia>();
		curso1.add(m);
		curso1.add(m2);

		List<Materia> curso2 = new ArrayList<Materia>();
		curso2.add(m);

		// Metodos de Matricula

		Matricula matricula = new Matricula();
		matricula.setEstudiante(e);
		matricula.setMateria(curso1);
		matricula.setNumero("001");
		System.out.println("MATRICULA----------");
		this.matriculaService.insertar(matricula);

		Matricula matricula2 = new Matricula();
		matricula2.setEstudiante(e1);
		matricula2.setMateria(curso2);
		matricula2.setNumero("002");
		this.matriculaService.insertar(matricula2);

		matricula.setEstudiante(e1);
		this.matriculaService.actualizar(matricula);
		this.matriculaService.buscar("001");
		this.matriculaService.borrar("002");

	}

}
