package com.example.productospais.Repository;

import com.example.productospais.Model.PaisModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<PaisModel, Integer> {
}
