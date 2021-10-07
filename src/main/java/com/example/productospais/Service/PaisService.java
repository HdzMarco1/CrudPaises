package com.example.productospais.Service;

import com.example.productospais.Model.PaisModel;
import com.example.productospais.Repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PaisService {

    @Autowired
    PaisRepository paisRepository;

    public ArrayList<PaisModel> obtenerPaises(){
        return (ArrayList<PaisModel>) paisRepository.findAll();
    }

    public PaisModel guardarPais(PaisModel pais){
        return paisRepository.save(pais);
    }

    public PaisModel editarPais(PaisModel pais){
        return paisRepository.save(pais);
    }

    public Optional<PaisModel> obtenerPais(Integer id){
        return paisRepository.findById(id);
    }

    public boolean eliminarPais(Integer id){
        try{
            paisRepository.deleteById(id);
            return true;
        }catch (Exception error){
            return false;
        }
    }

}
