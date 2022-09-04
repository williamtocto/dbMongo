package com.example.crudmongodb.service;

import com.example.crudmongodb.comoons.GenericService;
import com.example.crudmongodb.model.Producto;

public interface ProductoService extends GenericService<Producto,Long> {

    Producto findbByID(Long id);
}
