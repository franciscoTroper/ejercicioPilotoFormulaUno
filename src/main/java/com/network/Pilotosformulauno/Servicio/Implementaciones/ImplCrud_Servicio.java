package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Nif;
import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Nif;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Piloto;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Telefono;
import com.network.Pilotosformulauno.Servicio.ICrud;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class ImplCrud_Servicio<T,ID> implements ICrud<T,ID> {


    protected abstract IGenerico_repositorio<T,ID> getRepo();
    @Autowired
    private IRepositorio_Nif iRepositorioNif;
    @Autowired
    private IRepositorio_Piloto iRepositorioPiloto;
    @Autowired
    private IRepositorio_Telefono iRepositorioTelefono;
    @PersistenceContext
    private EntityManager entityManager;


    public T register(T t) throws Exception{
        Piloto piloto= (Piloto) t;
        Nif nif =iRepositorioNif.findByNumero(piloto.getNif().getNumero());
        if (nif==null){return getRepo().save(t);}
        else {System.out.println("Ya existe este piloto"); return null;}

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
    @Transactional
    public void eliminar(ID id) {

        iRepositorioTelefono.deleteAllByIdPiloto((Long)id);
        iRepositorioPiloto.deleteAllByIdPiloto((Long) id);
        iRepositorioPiloto.deleteAllFromPilotoByIdPiloto((Long)id);

    }
}
