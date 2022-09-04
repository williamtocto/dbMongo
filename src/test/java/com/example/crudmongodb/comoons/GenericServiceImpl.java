package com.example.crudmongodb.comoons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public abstract class  GenericServiceImpl<T,ID extends Serializable> implements GenericService<T,ID> {

    @Override
    public  T save(T Entity){
        return getDao().save(Entity);
    }

    @Override
    public void delete(ID id){
        getDao().deleteById(id);
    }

    @Override
    public T get(ID id){
        Optional<T> obj=getDao().findById(id);
        if(obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj -> list.add(obj));
        return list;
    }
    public abstract CrudRepository<T,ID> getDao();

}
