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


//    @ElementCollection
//    @CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "id_piloto"))
    @OneToMany(mappedBy = "piloto")
    private Set<Telefono> telefonos=new HashSet<>();

    @ManyToOne
    @JoinColumn(name="id_pilotoEscuderia", nullable = false, foreignKey = @ForeignKey(name="FK_piloto"))
    private Escuderia escuderia;

    @ManyToMany
    @JoinTable(
            name = "piloto_temporada",
            joinColumns = @JoinColumn(name = "id_piloto",nullable = false, foreignKey = @ForeignKey(name = "FK_temporada")),
            inverseJoinColumns = @JoinColumn(name = "id_temporada",nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_temporada"))
    )
    private Set<Temporada> temporadas=new HashSet<>();

    @OneToOne
    @JoinColumn(name="id_pilotoNif", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_nif"))
    private Nif nif;

    @OneToOne
    @JoinColumn(name="id_pilotoFacturacion", nullable = false, foreignKey = @ForeignKey(name="FK_piloto_facturacion"))
    private Facturacion facturacion;







}
