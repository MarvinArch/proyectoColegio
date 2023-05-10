package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "nivel")
@Data
public class nivelesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nivel_id", length = 11)
    private int idNivel;
    @Column(length = 45)
    private String tipo;


    @OneToOne(mappedBy = "niveles")
    private cursoModel cursos;
}
