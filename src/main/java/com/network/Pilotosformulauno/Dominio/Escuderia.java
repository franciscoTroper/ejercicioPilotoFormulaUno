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
@Table(name = "escuderias")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscuderia;
    @Column(length = 30,nullable = false)
    private String nombre;
    @Column(length = 30,nullable = false)
    private String pais;


    @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Piloto> pilotoset;
}
