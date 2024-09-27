package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "Telefonos")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefono;
    @Column(name = "numeros",nullable = false)
    private long numero;

    public Telefono(long numeroP){
        numero=numeroP;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "idTelefono=" + idTelefono +
                ", numero=" + numero +
                ", piloto=" + piloto.getNombre() +
                '}';
    }

    @ManyToOne
    @JoinColumn(name="id_Piloto", nullable = false, foreignKey = @ForeignKey(name="FK_telefono_piloto"))
    private Piloto piloto;
}
