package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	public Retiro buscar(String ctaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el retiro con la cuenta: " + ctaOrigen);
		Retiro r = new Retiro();
		r.setNumeroCuentaOrigen(ctaOrigen);
		return r;
	}

	@Override
	public void actualizar(String ctaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el retiro con la cuenta: " + ctaOrigen);
	}

	@Override
	public void borrar(String ctaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el retiro con la cuenta: " + ctaOrigen);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro = new ArrayList<>();
		Retiro r1 = new Retiro();
		r1.setFechaTransferencia(LocalDateTime.of(2022,12,20,13,14,10));;
		r1.setMontoTransferir(new BigDecimal(25)); 
		r1.setNumeroCuentaOrigen("1239");
		
		listaRetiro.add(r1);
		
		return listaRetiro;
	}

}
