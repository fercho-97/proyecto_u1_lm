package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {

	private LocalDateTime fechaCita;

	// 2) DI por constructor
	private Doctor doctor;
	private Paciente paciente;

	public CitaMedica(Doctor doctor, Paciente paciente) { // instancia apartir de constructor
		// TODO Auto-generated constructor stub

		this.doctor = doctor;
		this.paciente = paciente;

	}

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

		return "Cita agendada";

	}

	// SET Y GET

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

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
