package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "escuderias")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEscuderia;
    @Column(length = 30,nullable = false)
    private String nombre;
    @Column(length = 30,nullable = false)
    private String pais;


    public Escuderia(String nombreP, String paisP){
        nombre=nombreP;
        pais=paisP;
    }

    @Override
    public String toString() {
        return "Escuderia{" +
                "idEscuderia=" + idEscuderia +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", pilotoset=" + pilotoset.size() +
                '}';
    }

    @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Piloto> pilotoset;
}
