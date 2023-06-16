package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tema_contenido")
@Data
public class TemaContenidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tema_contenido")
    private Long idTemaCOntenido;
    @Column(name = "unidad_contenido")
    private String unidadContenido;
    @Column(name = "descripcion_contenido")
    private String descripcionContenido;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_contenido")
    private PostModel postContenido;

}
