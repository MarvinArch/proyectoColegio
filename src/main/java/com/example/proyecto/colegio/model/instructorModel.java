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
    @Column(name = "intructor_id", length = 11)
    private int idInstructor;
    @Column(length = 120)
    private String nombres;
    @Column(length = 120)
    private String apellidos;
    @Column(length = 11)
    private int identificacion;
    @Column(length = 120)
    private String ciudad;
    @Column(length = 120)
    private String pais;
    @Column(length = 255)
    private String direccion;
    @Column(length = 11)
    private int telefono;
    @Column(length = 100)
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
