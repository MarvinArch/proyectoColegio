package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Time;
import java.util.List;

@Entity(name = "curso")
@Data
public class CursoModel {
    @Id
    @Column(name = "id_curso")
    private Long idCurso;
    @Column(name = "nombre_curso", length = 50)
    private String nombreCurso;
    @Column(name = "imagen_curso", length = 50)
    private String imagenCurso;
    @Column(name = "hora_inicio")
    private Time horaInicio;
    @Column()
    private String seccion;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grado_curso")
    private GradoModel gradoCurso;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profesor_curso")
    private ProfesorModel profesorCurso;


}
