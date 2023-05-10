package com.example.proyecto.colegio.model;

import com.example.proyecto.colegio.Enum.puntaje;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Entity(name = "comentario")
@Data
public class comentarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comentario_id", length = 11)
    private int idComentario;
    @Column(length = 60, name = "titulo_comentario")
    private String tituloComentario;
    @Column(name = "texto_comentario", length = 255)
    private String textoComentario;
    @Enumerated(EnumType.STRING)
    private puntaje puntajes;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
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
