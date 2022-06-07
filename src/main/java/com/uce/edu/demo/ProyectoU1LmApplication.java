package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1718191415");
		this.estudianteService.insertarEstudiante(e);

		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Juanito");
		e1.setApellido("Perez");
		e1.setCedula("0618759623");
		this.estudianteService.insertarEstudiante(e1);
		
		//Usar los 3 metodos restantes: actulizar borrar y buscar
		
		e.setCedula("1701020304");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarApellido("Perez");
		
		this.estudianteService.borrarEstudiante("1718191415");
	}

}
