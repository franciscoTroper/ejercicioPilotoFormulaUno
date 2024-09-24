package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Nif;

import java.util.List;

public interface IServicio_Nif {
    Nif alta(Nif nif);
    void baja(Nif nif);
    Nif modificar(Nif nif);
    Nif consultarPorId(long idNif);
    List<Nif> consultarTodo();

}
