package com.example.crudmongodb.service;

import com.example.crudmongodb.comoons.GenericServiceImpl;
import com.example.crudmongodb.model.Producto;
import com.example.crudmongodb.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoRepository;
    }


}
