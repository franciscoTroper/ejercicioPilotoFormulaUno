package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;

import java.util.List;

public interface ICrud<T,ID> {
    T register(T p) throws Exception;
    T modificar(T p) throws Exception;
    List<T> Lister()throws Exception;
    T listerPorID(ID id) throws Exception;
    void eliminar(ID id) throws Exception;
    void eliminarPilotoPorNumeroNif(Long nif);
}
