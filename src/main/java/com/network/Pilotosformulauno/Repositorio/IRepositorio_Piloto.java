package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorio_Piloto extends IGenerico_repositorio<Piloto,Integer> {
    Temporada findbyidTemporadaLike(int idPiloto) throws Exception;
    Escuderia findByidEscuderiaLike(int idPiloto) throws Exception;
}
