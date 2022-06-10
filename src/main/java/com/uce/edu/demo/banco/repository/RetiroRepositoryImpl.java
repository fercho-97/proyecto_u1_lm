package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transaccion: " + r);
	}

	@Override
	public Retiro buscar(String numeroTransaccion) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la transaccion: " + numeroTransaccion);
		Retiro r = new Retiro();
		r.setNumeroTransaccion(numeroTransaccion);
		return r;
	}

	@Override
	public void actualizar(String numeroTransaccion) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la transaccion: " + numeroTransaccion);
	}

	@Override
	public void borrar(String numeroTransaccion) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la transaccion: " + numeroTransaccion);
	}

}
