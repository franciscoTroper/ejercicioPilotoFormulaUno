package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepositorio_Escuderia extends IGenerico_repositorio<Escuderia,Integer> {
    List<Piloto> findAllbyidPilotolike(int idEscuderia) throws Exception;
}
