package com.network.Pilotosformulauno.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Telefonos")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefono;
    private long numero;

    @ManyToOne
    @JoinColumn(name="id_telefonoPiloto", nullable = false, foreignKey = @ForeignKey(name="FK_telefono_piloto"))
    private Piloto piloto;
}
