package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Piloto;
import com.network.Pilotosformulauno.Persistencia.IRepositorio_Piloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Piloto implements IServicio_Piloto {
    @Autowired
    private IRepositorio_Piloto iRepositorioPiloto;

    @Override
    public Piloto alta(Piloto piloto) {
        return iRepositorioPiloto.save(piloto);
    }

    @Override
    public void baja(Piloto piloto) {
        iRepositorioPiloto.delete(piloto);
    }

    @Override
    public Piloto modificar(Piloto piloto) {
        return iRepositorioPiloto.save(piloto);
    }

    @Override
    public Piloto consultarPorId(long idPiloto) {
        return iRepositorioPiloto.findById(idPiloto).orElse(null);
    }

    @Override
    public List<Piloto> consultarTodo() {
        return iRepositorioPiloto.findAll();
    }
}
