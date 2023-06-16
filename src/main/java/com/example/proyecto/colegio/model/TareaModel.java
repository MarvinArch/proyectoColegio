package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity(name = "tarea")
@Data
public class TareaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "is_tarea")
    private Long idTarea;
    @Column(name = "fecha_entrega")
    private Date fechaEntrega;
    @Column(name = "instruccines_tarea", length = 255)
    private String intruccionesTarea;
    @Column(name = "ubicacion_entrega")
    private String ubicacionEntrega;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tarea_post")
    private PostModel tareaPost;
}
