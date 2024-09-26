package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Nif;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Nif;
import com.network.Pilotosformulauno.Servicio.IServicio_Nif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Nif extends ImplCrud_Servicio<Nif,Integer> implements IServicio_Nif {
    @Autowired
    private IRepositorio_Nif iRepositorioNif;


    @Override
    protected IGenerico_repositorio<Nif, Integer> getRepo() {
        return iRepositorioNif;
    }
}
