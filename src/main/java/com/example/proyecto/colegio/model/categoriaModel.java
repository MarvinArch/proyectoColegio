package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Entity(name = "categoria")
@Data
public class categoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11, name = "categoria_id")
    private int idCategoria;
    @Column(length = 120, name = "nombre_categoria")
    private String nombreCategoria;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ToString.Exclude// evita recursividad
    @EqualsAndHashCode.Exclude//evita recursividad
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "categoria"
    )
    private Set<cursoModel> cursos;
}
