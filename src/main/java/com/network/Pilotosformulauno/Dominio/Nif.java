package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "nifs")
public class Nif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNif;
    private char letras;
    private long numero;

    public Nif(char letraP,long numeroP){
        letras=letraP;
        numero=numeroP;
    }

}
