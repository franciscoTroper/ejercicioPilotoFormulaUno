package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Telefono;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Telefono;
import com.network.Pilotosformulauno.Servicio.ISevicio_Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Telefono extends ImplCrud_Servicio<Telefono,Integer> implements ISevicio_Telefono {
    @Autowired
    private IRepositorio_Telefono iRepositorioTelefono;


    @Override
    protected IGenerico_repositorio<Telefono, Integer> getRepo() {
        return iRepositorioTelefono;
    }
}
