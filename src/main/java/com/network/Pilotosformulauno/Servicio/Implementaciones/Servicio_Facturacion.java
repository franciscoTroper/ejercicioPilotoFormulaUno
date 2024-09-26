package com.network.Pilotosformulauno.Servicio.Implementaciones;

import com.network.Pilotosformulauno.Dominio.Facturacion;
import com.network.Pilotosformulauno.Repositorio.IGenerico_repositorio;
import com.network.Pilotosformulauno.Repositorio.IRepositorio_Facturacion;
import com.network.Pilotosformulauno.Servicio.IServicio_Facturacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Facturacion extends ImplCrud_Servicio<Facturacion,Integer> implements IServicio_Facturacion {

    @Autowired
    private IRepositorio_Facturacion iRepositorioFacturacion;


    @Override
    protected IGenerico_repositorio<Facturacion, Integer> getRepo() {
        return iRepositorioFacturacion;
    }
}
