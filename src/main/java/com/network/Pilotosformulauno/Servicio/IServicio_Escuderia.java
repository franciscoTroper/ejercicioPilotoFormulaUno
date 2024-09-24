package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;

import java.util.List;

public interface IServicio_Escuderia {
    Escuderia alta(Escuderia escuderia);
    void baja(Escuderia escuderia);
    Escuderia modificar(Escuderia escuderia);
    Escuderia consultarPorId(long idEscuderia);
    List<Escuderia> consultarTodo();
}
