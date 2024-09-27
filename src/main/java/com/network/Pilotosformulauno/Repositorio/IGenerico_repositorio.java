package com.network.Pilotosformulauno.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenerico_repositorio<T,ID> extends JpaRepository<T,ID> {
}
