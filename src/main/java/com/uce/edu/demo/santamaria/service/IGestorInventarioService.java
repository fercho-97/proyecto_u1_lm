package com.uce.edu.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.santamaria.modelo.Producto;

public interface IGestorInventarioService {

	public BigDecimal calculoPrecio(Producto p);

	public List<Producto> busquedaFecha(List<Producto> bodega, LocalDateTime fechaBusqueda);
}
