package com.network.Pilotosformulauno.Persistencia;

import com.network.Pilotosformulauno.Dominio.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorio_Piloto extends JpaRepository<Piloto,Long> {
}
