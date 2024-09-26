package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Servicio.ICrud;

import java.util.List;
import java.util.Optional;

public abstract class ImplCrud_Servicio<T,ID> implements ICrud<T,ID> {

    protected abstract IGenerico_repositorio<T,ID> getRepo();

    public T register(T t) throws Exception{
        return getRepo().save(t);
    }
    public T modificar(T t)throws Exception{
        return getRepo().save(t);
    }
    public List<T> Lister()throws Exception{
        return getRepo().findAll();
    }
    public T listerPorID(ID id){
        Optional<T> t1= getRepo().findById(id);
        return t1.isPresent()?t1.get():null;
    }
    public void eliminar(ID id){
        getRepo().deleteById(id);

    }
}
