package com.example.crudmongodb.controller;

import com.example.crudmongodb.model.Producto;
import com.example.crudmongodb.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>>listar() {
        List<Producto> lista=productoService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Producto> crearLista(@RequestBody Producto u) {
        return new ResponseEntity<>(productoService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> eliminarLista(@PathVariable Long id) {
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Producto> actualizarLista(@PathVariable Long id, @RequestBody Producto c) {

        Producto listaActual = productoService.get(id);
        listaActual.setNombre(c.getNombre());
        listaActual.setCantidad(c.getCantidad());
        listaActual.setPrecio(c.getPrecio());
        listaActual.setDescripcion(c.getDescripcion());

        productoService.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
