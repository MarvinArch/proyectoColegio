package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;

@Entity(name = "comentario")
@Data
public class ComentarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;
    @Column(name = "titulo_comentario", length = 150)
    private String tituloComentario;
    @Column(name = "contenido_comeentario", length = 255)
    private String contenidoComentario;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "persona_comentario")
    private PersonaModel personaComentario;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_comentario")
    private PostModel postComentario;

}
