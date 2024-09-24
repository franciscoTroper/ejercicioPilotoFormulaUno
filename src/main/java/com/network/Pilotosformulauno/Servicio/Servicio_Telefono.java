package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Telefono;
import com.network.Pilotosformulauno.Persistencia.IRepositorio_Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Telefono implements ISevicio_Telefono{
    @Autowired
    private IRepositorio_Telefono iRepositorioTelefono;

    @Override
    public Telefono alta(Telefono telefono) {
        return iRepositorioTelefono.save(telefono);
    }

    @Override
    public void baja(Telefono telefono) {
        iRepositorioTelefono.delete(telefono);
    }

    @Override
    public Telefono modificar(Telefono telefono) {
        return iRepositorioTelefono.save(telefono);
    }

    @Override
    public Telefono consultarPorId(long idTelefono) {
        return iRepositorioTelefono.findById(idTelefono).orElse(null);
    }

    @Override
    public List<Telefono> consultarTodo() {
        return iRepositorioTelefono.findAll();
    }
}
