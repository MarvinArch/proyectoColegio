package com.example.proyecto.colegio.model;

import jakarta.persistence.*;

@Entity(name = "comentario_curso")
public class comentarioCursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @ManyToOne
    @JoinColumn(name = "comentario_id")
    private comentarioModel comentarios;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private cursoModel cursos;
}
