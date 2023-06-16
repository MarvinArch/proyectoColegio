package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Entity(name = "grado")
@Data
public class GradoModel {
    @Id
    @Column(name = "id_grado")
    private Long idGrado;
    private String nombreGrado;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "encargado")
    private ProfesorModel encargado;

    public GradoModel(Long idGrado, String nombreGrado, ProfesorModel encargado) {
        this.idGrado = idGrado;
        this.nombreGrado = nombreGrado;
        this.encargado = encargado;
    }

    public GradoModel() {
    }
}
