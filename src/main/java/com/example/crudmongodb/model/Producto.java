package com.example.crudmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
@AllArgsConstructor
@Data
public class Producto {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;




}
