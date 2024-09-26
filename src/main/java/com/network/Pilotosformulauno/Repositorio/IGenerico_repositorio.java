package com.network.Pilotosformulauno.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenerico_repositorio<T,ID> extends JpaRepository<T,ID> {
}
