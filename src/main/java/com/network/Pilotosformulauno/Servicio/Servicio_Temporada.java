package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Temporada;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Temporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Temporada implements IServicio_Temporada{

    @Autowired
    private IRepositorio_Temporada iRepositorioTemporada;

    @Override
    public Temporada alta(Temporada temporada) {
        return iRepositorioTemporada.save(temporada);
    }

    @Override
    public void baja(Temporada temporada) {
        iRepositorioTemporada.delete(temporada);
    }

    @Override
    public Temporada modificar(Temporada temporada) {
        return iRepositorioTemporada.save(temporada);
    }

    @Override
    public Temporada consultarPorId(long idTemporada) {
        return iRepositorioTemporada.findById(idTemporada).orElse(null);
    }

    @Override
    public List<Temporada> consultarTodo() {
        return iRepositorioTemporada.findAll();
    }
}
