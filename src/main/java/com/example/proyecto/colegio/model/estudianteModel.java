package com.example.proyecto.colegio.model;

import com.example.proyecto.colegio.Enum.genero;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Entity(name = "estudiante")
@Data
public class estudianteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id", length = 11)
    private int idEstudiante;
    @Column(length = 120)
    private String nombres;
    @Column(length = 120)
    private String apellidos;
    @Column(length = 120)
    private String email;
    @Column(length = 11)
    private int telefono;
    @Enumerated(EnumType.STRING)
    private genero generos;
    @Column(length = 255)
    private String direccion;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "estudiantes"
    )
    private Set<inscripcionesModel> inscripciones;
}
