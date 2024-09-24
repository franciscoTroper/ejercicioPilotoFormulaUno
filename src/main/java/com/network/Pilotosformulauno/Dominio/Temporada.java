package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
