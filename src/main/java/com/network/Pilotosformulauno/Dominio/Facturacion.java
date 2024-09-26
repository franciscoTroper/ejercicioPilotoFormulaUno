package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "facturaciones")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacturacion;
    private int sueldo;
    private int publicidad;

    @OneToOne(mappedBy = "facturacion",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Piloto piloto;
}
