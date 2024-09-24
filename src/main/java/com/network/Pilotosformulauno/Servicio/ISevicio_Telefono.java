package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Telefono;

import java.util.List;

public interface ISevicio_Telefono {
    Telefono alta(Telefono telefono);
    void baja(Telefono telefono);
    Telefono modificar(Telefono telefono);
    Telefono consultarPorId(long idTelefono);
    List<Telefono> consultarTodo();
}
