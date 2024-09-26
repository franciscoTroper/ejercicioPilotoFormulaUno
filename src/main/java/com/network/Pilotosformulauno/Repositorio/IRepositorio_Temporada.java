package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepositorio_Temporada extends IGenerico_repositorio<Temporada,Integer> {
    List<Piloto> findAllbyidPilotoLike(int idTemporada) throws Exception;
}
