package com.example.productospais.Repository;

import com.example.productospais.Model.ProductosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends CrudRepository<ProductosModel, Integer> {
}
