package com.network.Pilotosformulauno;

import com.network.Pilotosformulauno.Servicio.Implementaciones.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PilotosformulaunoApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(PilotosformulaunoApplication.class, args);
	}

	@Autowired
	private Servicio_Piloto servicioPiloto;
	@Autowired
	private Servicio_Escuderia servicioEscuderia;
	@Autowired
	private Servicio_Facturacion servicioFacturacion;
	@Autowired
	private Servicio_Nif servicioNif;
	@Autowired
	private Servicio_Telefono servicioTelefono;
	@Autowired
	private Servicio_Temporada servicioTemporada;
	@Override
	public void run(String... args) throws Exception {
















//		Escuderia escuderiaMadrid = new Escuderia(0,"escuderiaMadrid","España");
//		Escuderia escuderiaToledo = new Escuderia(0,"escuderiaToledo","España");
//		Escuderia escuderiaCuenca = new Escuderia(0,"escuderiaCuenca","España");
//
//		Facturacion facturacion1= new Facturacion(0,1000,25);
//		Facturacion facturacion2= new Facturacion(0,500,24);
//		Facturacion facturacion3= new Facturacion(0,800,23);
//
//		Nif nif= servicioNif.alta(new Nif(0,'A',47518481));
//		Nif nif2= servicioNif.alta(new Nif(0,'A',47518482));
//		Nif nif3= servicioNif.alta(new Nif(0,'A',47518483));
//
//		Temporada temporada1= new Temporada(0,1,12);
//		Temporada temporada2= new Temporada(0,2,11);
//		Temporada temporada3= new Temporada(0,1,10);
//		Set<Temporada>temporadas=new HashSet<>(Set.of(temporada1,temporada3));
//
//		servicioEscuderia.alta(escuderiaMadrid);
//		servicioEscuderia.alta(escuderiaToledo);
//		servicioEscuderia.alta(escuderiaCuenca);
//
//		servicioFacturacion.alta(facturacion1);
//		servicioFacturacion.alta(facturacion2);
//		servicioFacturacion.alta(facturacion3);
//
//		servicioTemporada.alta(temporada1);
//		servicioTemporada.alta(temporada2);
//		servicioTemporada.alta(temporada3);


//		Piloto fran=new Piloto();
//		fran.setIdPiloto(0);
//		Telefono telefono=new Telefono(0,618292214,fran);
//		Telefono telefono2=new Telefono(0,618292215,fran);
//		Set<Telefono>telefonos=new HashSet<>(Set.of(telefono,telefono2));
//
//		Piloto piloto=new Piloto(0,
//				"Fran",
//				34,
//				telefonos,
//				escuderiaMadrid,
//				temporadas,
//				nif,
//				facturacion1);

//		servicioTelefono.alta(telefono);
//		servicioTelefono.alta(telefono2);
//		servicioPiloto.alta(piloto);
//
//
//		piloto=new Piloto(0,
//				"Fran",
//				34,telefonos,
//				escuderiaMadrid,
//				temporadas,
//				nif,
//				facturacion1);
//		servicioPiloto.modificar(piloto);
//		telefono=new Telefono(0,618292214,piloto);
//		telefono2=new Telefono(0,618292215,piloto);
//		servicioTelefono.modificar(telefono);
//		servicioTelefono.modificar(telefono2);








	}
}
