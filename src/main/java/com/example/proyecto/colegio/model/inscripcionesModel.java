package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "inscripciones")
@Data
public class inscripcionesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inscripcion_id")
    private int idInscripcion;
    @Column(name = "precio_pagado")
    private float precioPagado;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private estudianteModel estudiantes;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private cursoModel cursos;

}
