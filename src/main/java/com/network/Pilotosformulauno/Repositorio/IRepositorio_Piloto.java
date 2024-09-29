package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorio_Piloto extends IGenerico_repositorio<Piloto,Long> {
    @Modifying
    @Query(value = "DELETE FROM piloto_temporada WHERE id_piloto = :idPiloto", nativeQuery = true)
    void deleteAllByIdPiloto(@Param("idPiloto") Long idPiloto);

    void deleteAllFromPilotoByIdPiloto(Long id);
}
