package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "facturaciones")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacturacion;
    private int sueldo;
    private int publicidad;

    public Facturacion(int sueldoP,int publicidadP)
    {
        sueldo=sueldoP;
        publicidad=publicidadP;
    }

    @Override
    public String toString() {
        return "Facturacion{" +
                "idFacturacion=" + idFacturacion +
                ", sueldo=" + sueldo +
                ", publicidad=" + publicidad +
                ", piloto=" + piloto.getNombre() +
                '}';
    }

    @OneToOne(mappedBy = "facturacion",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Piloto piloto;
}
