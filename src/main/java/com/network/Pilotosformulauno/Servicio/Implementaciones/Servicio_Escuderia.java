package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Escuderia;
import com.network.Pilotosformulauno.Servicio.IServicio_Escuderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Escuderia extends ImplCrud_Servicio<Escuderia,Long> implements IServicio_Escuderia {

    @Autowired
    private IRepositorio_Escuderia iRepositorioEscuderia;

    @Override
    protected IGenerico_repositorio<Escuderia, Long> getRepo() {
        return iRepositorioEscuderia;
    }
}
