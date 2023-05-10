package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity(name = "inscripciones")
@Data
public class inscripcionesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inscripcion_id")
    private int idInscripcion;
    @Column(name = "precio_pagado")
    private float precioPagado;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private estudianteModel estudiantes;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private cursoModel cursos;

}
