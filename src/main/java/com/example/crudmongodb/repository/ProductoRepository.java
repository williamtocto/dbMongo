package com.example.crudmongodb.repository;

import com.example.crudmongodb.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, Long> {
}
