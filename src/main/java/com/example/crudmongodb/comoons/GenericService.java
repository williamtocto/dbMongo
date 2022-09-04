package com.example.crudmongodb.comoons;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T,ID extends Serializable>{

    public  T save(T entity);
    public void delete(ID id);
    public T get(ID id);
    public List<T> findAll();





}
