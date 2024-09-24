package com.network.Pilotosformulauno.Servicio;

import com.network.Pilotosformulauno.Dominio.Facturacion;
import com.network.Pilotosformulauno.Persistencia.IRepositorio_Facturacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Facturacion implements IServicio_Facturacion{
    @Autowired
    private IRepositorio_Facturacion iRepositorioFacturacion;

    @Override
    public Facturacion alta(Facturacion facturacion) {
        return iRepositorioFacturacion.save(facturacion);
    }

    @Override
    public void baja(Facturacion facturacion) {
        iRepositorioFacturacion.delete(facturacion);
    }

    @Override
    public Facturacion modificar(Facturacion facturacion) {
        return iRepositorioFacturacion.save(facturacion);
    }

    @Override
    public Facturacion consultarPorId(long idfacturacion) {
        return iRepositorioFacturacion.findById(idfacturacion).orElse(null);
    }

    @Override
    public List<Facturacion> consultarTodo() {
        return iRepositorioFacturacion.findAll();
    }
}
