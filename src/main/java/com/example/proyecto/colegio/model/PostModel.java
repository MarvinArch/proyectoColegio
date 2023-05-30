package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Entity(name = "post")
@Data
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post")
    private Long ipPost;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "titulo_post", length = 150)
    private String tituloPost;
    @Column
    private String ubicacion;
    private boolean tarea;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_post")
    private CursoModel cursoPost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profesor_post")
    private ProfesorModel profesorPost;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postComentario")
    private List<ComentarioModel> comentariosPost;
}
