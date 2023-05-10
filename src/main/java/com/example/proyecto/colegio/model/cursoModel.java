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
    @Column(name = "id_curso")
    private Long idCurso;
    private String titulo;
    private String subtitulo;
    private String descripcion;
    private String imagen;
    private String video;
    @Column(name = "horas_video")
    private String horaVideos;
    @Column(name = "cantidad_curso")
    private String cantidadCursos;
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
