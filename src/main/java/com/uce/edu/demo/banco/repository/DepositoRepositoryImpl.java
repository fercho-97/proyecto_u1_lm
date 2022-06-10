package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito: " + d);
	}

	@Override
	public Deposito buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el deposito con la cuenta de destino: " + numeroCuentaDestino);
		Deposito d = new Deposito();
		d.setNumeroCuentaDestino(numeroCuentaDestino);
		return d;
	}

	@Override
	public void actualizar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el deposito con la cuenta de destino: " + numeroCuentaDestino);
	}

	@Override
	public void borrar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha borrado en la base el deposito con la cuenta de destino: " + numeroCuentaDestino);
	}

}
