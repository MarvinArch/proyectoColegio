package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Entity(name = "comentario")
@Data
public class comentarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comentario_id")
    private int idComentario;
    @Column(length = 60, name = "titulo_comentario")
    private String tituloComentario;
    @Column(name = "texto_comentario")
    private String textoComentario;
    //@Enumerated(EnumType.STRING)
    //private Puntaje puntaje;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "comentarios"
    )
    private Set<comentarioCursoModel> comentariosCurso;
}
