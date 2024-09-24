package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Piloto;

import java.util.List;

public interface IServicio_Piloto {
    Piloto alta(Piloto piloto);
    void baja(Piloto piloto);
    Piloto modificar(Piloto piloto);
    Piloto consultarPorId(long idPiloto);
    List<Piloto> consultarTodo();

}
