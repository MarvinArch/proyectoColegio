package com.example.proyecto.colegio.model;

import com.example.proyecto.colegio.Enum.certificado;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity(name = "curso")
@Data
public class cursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", length = 11)
    private Long idCurso;
    @Column(length = 60)
    private String titulo;
    @Column(length = 100)
    private String subtitulo;
    @Column(length = 255)
    private String descripcion;
    @Column(length = 255)
    private String imagen;
    @Column(length = 255)
    private String video;
    @Column(name = "horas_video")
    private int horaVideos;
    @Column(name = "cantidad_curso")
    private int cantidadCursos;
    private float precio;
    @Enumerated(EnumType.STRING)
    private certificado certificados;
    private Date fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private instructorModel instructor;

    @ManyToOne
    @JoinColumn(name = "categoria_id") //
    private categoriaModel categoria;

    @OneToOne
    @JoinColumn(name = "nivel_id")
    private nivelesModel niveles;
}
