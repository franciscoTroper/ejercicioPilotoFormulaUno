package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorio_Temporada extends IGenerico_repositorio<Temporada,Long> {
//    List<Piloto> findByIdPiloto(int idPiloto);
}
