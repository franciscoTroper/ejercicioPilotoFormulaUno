package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Facturacion;

import java.util.List;

public interface IServicio_Facturacion {
    Facturacion alta(Facturacion facturacion);
    void baja(Facturacion facturacion);
    Facturacion modificar(Facturacion facturacion);
    Facturacion consultarPorId(long idfacturacion);
    List<Facturacion> consultarTodo();
}
