package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "pilotos")

public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPiloto;
    @Column(length = 30)
    private String nombre;
    private int edad;



    private Set<Telefono> telefonos;
    @ManyToOne
    @JoinColumn(name="id_pilotoEscuderia", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_escuderia"))
    private Escuderia escuderia;

    @ManyToMany
    @JoinTable(
            name = "piloto_temporada",
            joinColumns = @JoinColumn(name = "id_piloto",foreignKey = @ForeignKey(name = "FK_piloto_temporada")),
            inverseJoinColumns = @JoinColumn(name = "id_temporada",foreignKey = @ForeignKey(name = "FK_piloto_temporada"))
    )
    private Set<Temporada> temporadas;

    @OneToOne
    @JoinColumn(name="id_pilotoNif", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_nif"))
    private Nif nif;

    @OneToOne
    @JoinColumn(name="id_pilotoFacturacion", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_facturacion"))
    private Facturacion facturacion;







}
