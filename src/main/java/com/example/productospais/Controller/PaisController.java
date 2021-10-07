package com.example.productospais.Controller;

import com.example.productospais.Model.PaisModel;
import com.example.productospais.Service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/productos/pais")
public class PaisController {

    @Autowired
    PaisService paisService;

    @GetMapping()
    public ArrayList<PaisModel> mostrarPaises(){
        return paisService.obtenerPaises();
    }

    @GetMapping("/{id}")
    public Optional<PaisModel> obtenerPorId(@PathVariable("id") Integer id){
        return paisService.obtenerPais(id);
    }

    @PostMapping()
    public PaisModel guardarPais(@RequestBody PaisModel pais){
        return paisService.guardarPais(pais);
    }

    @PutMapping()
    public PaisModel actualizarPais(@RequestBody PaisModel pais){
        return paisService.editarPais(pais);
    }

    @DeleteMapping("/{id}")
    public String eliminarPaisPorId(@PathVariable("id") Integer id){
        boolean si = paisService.eliminarPais(id);
        if (si) {
            return "se elimino pais con id " + id;
        }else {
            return "no se encontro pais con id " + id;
        }
    }



}
