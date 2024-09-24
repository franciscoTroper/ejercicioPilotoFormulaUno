package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Temporada;

import java.util.List;

public interface IServicio_Temporada {
    Temporada alta(Temporada temporada);
    void baja(Temporada temporada);
    Temporada modificar(Temporada temporada);
    Temporada consultarPorId(long idTemporada);
    List<Temporada> consultarTodo();
}
