package com.uce.edu.demo.santamaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.santamaria.modelo.Producto;
import com.uce.edu.demo.santamaria.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Autowired
	private IGestorInventarioService iGestorInventarioService;
	
	@Override
	public void ingresarProducto(Producto p) {
		// TODO Auto-generated method stub
		p.setValorVenta(this.iGestorInventarioService.calculoPrecio(p));
		this.iProductoRepository.insertar(p);
	}

	@Override
	public Producto buscarProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombreProducto);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void borrarProducto(String nombre) {
		// TODO Auto-generated method stub
		this.iProductoRepository.borrar(nombre);
		
	}

}
