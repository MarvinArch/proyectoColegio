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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "encargado")
    private ProfesorModel encargado;
    @JsonIgnore
    @ToString.Exclude// evita recursividad
    @EqualsAndHashCode.Exclude//evita recursividad
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gradoCurso")
    private List<CursoModel> cursosGrado;
}
