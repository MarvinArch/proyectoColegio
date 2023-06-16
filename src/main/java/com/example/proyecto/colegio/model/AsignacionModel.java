package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.engine.internal.Cascade;

@Entity(name = "asignacion")
@Data
public class AsignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_asignacion")
    private Long codigoAsignacion;
    @Column(name = "zona_curso")
    private double zonaCurso;
    @Column(name = "examen_final")
    private double examneFinal;
    @Column(name = "nota_Final")
    private double notaFinal;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_asignado")
    private CursoModel cursoAsignado;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alumno_asignado")
    private AlumnoModel alumnoAsignado;
}
