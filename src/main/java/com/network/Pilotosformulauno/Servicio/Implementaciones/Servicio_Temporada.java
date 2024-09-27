package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Temporada;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Temporada;
import com.network.Pilotosformulauno.Servicio.IServicio_Temporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Servicio_Temporada extends ImplCrud_Servicio<Temporada,Long> implements IServicio_Temporada {

    @Autowired
    private IRepositorio_Temporada iRepositorioTemporada;

    @Override
    protected IGenerico_repositorio<Temporada, Long> getRepo() {
        return iRepositorioTemporada;
    }
}
