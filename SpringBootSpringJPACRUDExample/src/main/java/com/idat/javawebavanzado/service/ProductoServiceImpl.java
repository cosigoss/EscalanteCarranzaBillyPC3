package com.idat.javawebavanzado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.javawebavanzado.model.Article;
import com.idat.javawebavanzado.model.Producto;
import com.idat.javawebavanzado.repository.ProductoRepository;


@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
 
 @Autowired
 ProductoRepository productoRepository;

 @Override
 public List<Producto> getAllProducto() {
  return (List<Producto>) productoRepository.findAll();
 } 
 
 @Override
 public Producto getProductoById(long id) {
  return productoRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(Producto producto) {
  productoRepository.save(producto);
 }

 @Override
 public void deleteProducto(long id) {
	 productoRepository.deleteById(id);
 }











}
