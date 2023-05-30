package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Entity(name = "profesor")
@Data
public class ProfesorModel {
    @Id
    @Column(length = 25)
    private Long identificacion;
    @Column(name = "no_cuenta")
    private String noCuenta;
    @Column(length = 75)
    private String profesion;
    @ToString.Exclude// evita recursividad
    @EqualsAndHashCode.Exclude//evita recursividad
    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "datos_generales")
    private PersonaModel datosGenerales;
    @JsonIgnore
    @ToString.Exclude// evita recursividad
    @EqualsAndHashCode.Exclude//evita recursividad
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "profesorCurso")
    private List<CursoModel> profesorCurso;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "profesorPost")
    private List<PostModel> PostsProfesor;
}
