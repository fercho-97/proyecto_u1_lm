package com.uce.edu.demo.banco.repository;

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

}
