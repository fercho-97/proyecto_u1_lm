package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la trasferencia" + t);
		
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la transferencia con la cuenta de origen: " + numeroCuentaOrigen);
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(numeroCuentaOrigen);

		return t;
	}

	@Override
	public void actualizar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la transferencia con la cuenta de origen: " + numeroCuentaOrigen);

	}

	@Override
	public void borrar(String numerCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la transferncia con la cuenta de origen: " + numerCuentaOrigen);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//aqui deberia estar e sql a la base
		
		List<Transferencia> listaConsulta = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaOrigen("1234");
		trans1.setNumeroCuentaDestino("12567");
		
		listaConsulta.add(trans1);
		
		
		return listaConsulta;
	}

}
