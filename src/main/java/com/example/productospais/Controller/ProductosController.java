package com.example.productospais.Controller;

import com.example.productospais.Model.ProductosModel;
import com.example.productospais.Service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    ProductosService productosService;

    @GetMapping()
    public ArrayList<ProductosModel> obtenerProductos(){
        return productosService.obtenerProductos();
    }

    @GetMapping("/{id}")
    public Optional<ProductosModel> obtenerPorIdProducto(@PathVariable("id") Integer id){
        return productosService.obtenerProducto(id);
    }

    @PostMapping()
    public  ProductosModel guardarProducto(@RequestBody ProductosModel producto){
        return productosService.guardarProducto(producto);
    }

    @PutMapping()
    public  ProductosModel editarProducto(@RequestBody ProductosModel producto){
        return productosService.editarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable("id") Integer id){
        boolean si = productosService.eliminarProducto(id);
        if (si){
            return "se elimino correctamente un producto con id " + id;
        }else {
            return "no se pudo encontrar el producto";
        }
    }


}
