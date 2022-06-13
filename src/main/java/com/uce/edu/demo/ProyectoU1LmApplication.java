package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.santamaria.modelo.Inventario;
import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.service.IGestorInventarioService;
import com.uce.edu.demo.santamaria.service.IInventarioService;
import com.uce.edu.demo.santamaria.service.IProductoService;

@SpringBootApplication
public class ProyectoU1LmApplication implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IGestorInventarioService iGestorInventarioService;

	@Autowired
	private IInventarioService iInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Tarea 4 con Spring Framework");

		Producto p1 = new Producto();
		p1.setNombre("atun");
		p1.setValorCompra(new BigDecimal(50));
		p1.setCantidad(10);
		p1.setFechaIngreso(LocalDateTime.of(2022, 10, 10, 12, 12));
		this.iProductoService.ingresarProducto(p1);

		Producto p2 = new Producto();
		p2.setNombre("fideos");
		p2.setValorCompra(new BigDecimal(5));
		p2.setCantidad(12);
		p2.setFechaIngreso(LocalDateTime.of(2022, 9, 10, 12, 12));
		this.iProductoService.ingresarProducto(p2);

		Producto p3 = new Producto();
		p3.setNombre("detergente");
		p3.setValorCompra(new BigDecimal(7.5));
		p3.setCantidad(8);
		p3.setFechaIngreso(LocalDateTime.of(2022, 8, 10, 12, 12));
		this.iProductoService.ingresarProducto(p3);

		Producto p4 = new Producto();
		p4.setNombre("cereal");
		p4.setValorCompra(new BigDecimal(4.5));
		p4.setCantidad(50);
		p4.setFechaIngreso(LocalDateTime.of(2022, 7, 10, 12, 12));
		this.iProductoService.ingresarProducto(p4);

		Producto p5 = new Producto();
		p5.setNombre("carne molida");
		p5.setValorCompra(new BigDecimal(7.5));
		p5.setCantidad(15);
		p5.setFechaIngreso(LocalDateTime.of(2022, 8, 12, 12, 12));
		this.iProductoService.ingresarProducto(p5);

		System.out.println("Se ingresaron los productos");

		List<Producto> lista1 = new ArrayList<Producto>();
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);

		Inventario inventario1 = new Inventario();
		inventario1.setListaProductos(lista1);
		inventario1.setNombreInventario("Inventario-Diciembre");
		inventario1.setFechaIngresoReporte(LocalDateTime.of(2022, 12, 10, 12, 12));
		System.out.println("Se crea el inventario");
		this.iInventarioService.insertarInventario(lista1);

		System.out.println("Se crea el reporte busqueda por fecha------");
		List<Producto> reporte1 = this.iGestorInventarioService.busquedaFecha(lista1,LocalDateTime.of(2022, 8, 10, 12, 12));

	}

}
