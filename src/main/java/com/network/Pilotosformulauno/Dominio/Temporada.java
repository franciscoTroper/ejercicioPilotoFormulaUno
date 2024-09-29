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
@Table(name = "temporadas")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTemporada;
    private int inicio;
    private int fin;

    public Temporada(int inicioP,int finP)
    {
        inicio=inicioP;
        fin=finP;
    }

    @ManyToMany(mappedBy = "temporadas",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.REMOVE})
    private Set<Piloto> pilotos;
}
