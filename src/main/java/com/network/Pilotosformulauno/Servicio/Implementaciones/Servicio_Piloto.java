package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Piloto;
import com.network.Pilotosformulauno.Servicio.IServicio_Piloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Piloto extends ImplCrud_Servicio<Piloto,Integer> implements IServicio_Piloto {
    @Autowired
    private IRepositorio_Piloto iRepositorioPiloto;


    @Override
    protected IGenerico_repositorio<Piloto, Integer> getRepo() {
        return iRepositorioPiloto;
    }
}
