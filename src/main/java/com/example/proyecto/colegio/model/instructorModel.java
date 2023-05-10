package com.example.proyecto.colegio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Entity(name = "instructor")
@Data
public class instructorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intructor_id")
    private int idInstructor;
    private String nombres;
    private String apellidos;
    private int identificacion;
    private String ciudad;
    private String pais;
    private String direccion;
    private int telefono;
    private String email;
    private Date fechaCreacion;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "instructor"
    )
    private Set<cursoModel> cursos;
}
