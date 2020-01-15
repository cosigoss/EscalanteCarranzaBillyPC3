package com.idat.javawebavanzado.service;

import java.util.List;

import com.idat.javawebavanzado.model.Producto;



public interface ProductoService {

	public List<Producto> getAllProducto();
	 
	 public Producto getProductoById(long id);
	 
	 public void saveOrUpdate(Producto producto);
	 
	 public void deleteProducto(long id);
	
	
}
