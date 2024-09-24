package com.network.Pilotosformulauno.Persistencia;

import com.network.Pilotosformulauno.Dominio.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorio_Facturacion extends JpaRepository<Facturacion,Long> {
}
