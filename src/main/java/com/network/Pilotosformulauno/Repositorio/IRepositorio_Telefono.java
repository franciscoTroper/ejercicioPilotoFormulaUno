package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Dominio.Telefono;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositorio_Telefono extends IGenerico_repositorio<Telefono,Long> {
    @Modifying
    @Query(value = "DELETE FROM telefonos WHERE id_piloto = :idPiloto", nativeQuery = true)
    void deleteAllByIdPiloto(@Param("idPiloto") Long idPiloto);





}
