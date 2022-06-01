package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {

	private LocalDateTime fechaCita;

	// 3) DI por metodos SET
	private Doctor doctor; // a su metodo SET le aumento @Autoired
	private Paciente paciente; // a su metodo SET le aumento @Autoired

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaceinte) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaceinte);
		// se inserta la cita en la base de datos

		this.fechaCita = fechaCita;

		//

		return "Cita agendada 2";

	}

	// SET Y GET

	public Doctor getDoctor() {
		return doctor;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

}
