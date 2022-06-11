package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Deposito> listaDeposito = new ArrayList<>();
		Deposito d1 = new Deposito();
		d1.setFecha(LocalDateTime.of(2021,2,10,8,50,2));
		d1.setMonto(new BigDecimal(20));
		d1.setNumeroCuentaDestino("2345");
		
		
		listaDeposito.add(d1);
		
		Deposito d2 = new Deposito();
		d2.setFecha(LocalDateTime.of(2021,3,15,9,50,2));
		d2.setMonto(new BigDecimal(20));
		d2.setNumeroCuentaDestino("1234");
		
		listaDeposito.add(d2);
		
		return listaDeposito;
		
		
	}

}
