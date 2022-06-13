package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Producto;

@Service
public class GestorInventarioImpl implements IGestorInventarioService {

	

	@Override
	public BigDecimal calculoPrecio(Producto p) {
		// TODO Auto-generated method stub

		BigDecimal vVenta = p.getValorCompra()
				.add(p.getValorCompra().multiply(new BigDecimal(10)).divide(new BigDecimal(100)))
				.add(p.getValorCompra().multiply(new BigDecimal(12)).divide(new BigDecimal(100)));

		return vVenta;

	}

	@Override
	public List<Producto> busquedaFecha(List<Producto> inventario, LocalDateTime fechaBusqueda) {
		List<Producto> listaBusqueda = new ArrayList<>();
		for (Producto p : inventario) {
			if (p.getFechaIngreso().compareTo(fechaBusqueda) > 0) {
				listaBusqueda.add(p);

				System.out.println(p.getNombre() + " - " + p.getCantidad() + " - " + "$" + p.getValorVenta() + " - "
						+ p.getFechaIngreso());
			}

		}
		return listaBusqueda;
	}

}
