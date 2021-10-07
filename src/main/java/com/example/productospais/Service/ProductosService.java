package com.example.productospais.Service;

import com.example.productospais.Model.ProductosModel;
import com.example.productospais.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductosService {
    @Autowired
    ProductosRepository productosRepository;

    public ArrayList<ProductosModel> obtenerProductos(){
        return (ArrayList<ProductosModel>) productosRepository.findAll();
    }

    public Optional<ProductosModel> obtenerProducto(Integer id){
        return productosRepository.findById(id);
    }

    public ProductosModel guardarProducto(ProductosModel producto){
        return productosRepository.save(producto);
    }

    public ProductosModel editarProducto(ProductosModel producto){
        return productosRepository.save(producto);
    }

    public boolean eliminarProducto(Integer id){
        try{
            productosRepository.deleteById(id);
            return true;
        }catch (Exception error){
            return false;
        }
    }
}
