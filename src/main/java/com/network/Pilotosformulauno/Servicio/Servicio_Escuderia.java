package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Escuderia;
import com.network.Pilotosformulauno.Persistencia.IRepositorio_Escuderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Escuderia implements IServicio_Escuderia {
    @Autowired
    private IRepositorio_Escuderia iRepositorioEscuderia;

    @Override
    public Escuderia alta(Escuderia escuderia) {
        return iRepositorioEscuderia.save(escuderia);
    }

    @Override
    public void baja(Escuderia escuderia) {
        iRepositorioEscuderia.delete(escuderia);
    }

    @Override
    public Escuderia modificar(Escuderia escuderia) {
        return iRepositorioEscuderia.save(escuderia);
    }

    @Override
    public Escuderia consultarPorId(long idEscuderia) {
        return iRepositorioEscuderia.findById(idEscuderia).orElse(null);
    }

    @Override
    public List<Escuderia> consultarTodo() {
        return iRepositorioEscuderia.findAll();
    }
}
