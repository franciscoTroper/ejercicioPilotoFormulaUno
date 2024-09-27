package com.network.Pilotosformulauno.Repositorio;

import com.network.Pilotosformulauno.Dominio.Nif;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorio_Nif extends IGenerico_repositorio<Nif,Long>{
    Nif findByNumero(Long nif);
}
