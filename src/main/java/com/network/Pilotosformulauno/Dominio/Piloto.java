package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
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
    @Column(length = 30,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int edad;


    @OneToMany(mappedBy = "piloto",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private Set<Telefono> telefonos=new HashSet<>();

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})

    @JoinColumn(name="id_pilotoEscuderia", nullable = false, foreignKey = @ForeignKey(name="FK_piloto"))
    private Escuderia escuderia;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})

    @JoinTable(
            name = "piloto_temporada",
            joinColumns = @JoinColumn(name = "id_piloto",nullable = false, foreignKey = @ForeignKey(name = "FK_temporada")),
            inverseJoinColumns = @JoinColumn(name = "id_temporada",nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_temporada"))
    )
    private Set<Temporada> temporadas=new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_pilotoNif", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_nif"))
    private Nif nif;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_pilotoFacturacion", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_facturacion"))
    private Facturacion facturacion;

    public Piloto(String nombre, int edad, Set<Telefono> telefonos, Escuderia escuderia, Set<Temporada> temporadas, Nif nif, Facturacion facturacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonos = telefonos;
        this.escuderia = escuderia;
        this.temporadas = temporadas;
        this.nif = nif;
        this.facturacion = facturacion;
    }








}
