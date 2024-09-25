package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Nif;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Nif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Nif implements IServicio_Nif{
    @Autowired
    private IRepositorio_Nif iRepositorioNif;

    @Override
    public Nif alta(Nif nif) {
        return iRepositorioNif.save(nif);
    }

    @Override
    public void baja(Nif nif) {
        iRepositorioNif.delete(nif);
    }

    @Override
    public Nif modificar(Nif nif) {
        return iRepositorioNif.save(nif);
    }

    @Override
    public Nif consultarPorId(long idNif) {
        return iRepositorioNif.findById(idNif).orElse(null);
    }

    @Override
    public List<Nif> consultarTodo() {
        return iRepositorioNif.findAll();
    }
}
