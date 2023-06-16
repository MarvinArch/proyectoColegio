package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Entity(name = "alumno")
@Data
public class AlumnoModel {
    @Id
    private Long expediente;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name = "nombre_encargado", length = 120)
    private String nombreEncargado;
    @Column(name = "telefono_encargado", length = 15)
    private String telefonoEncargado;

    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    @JoinColumn(name = "datos_generales")
    private PersonaModel datosGenerales;

    @ManyToOne()
    @JoinColumn(name = "GradoAlumno")
    private GradoModel gradoAlumno;
}
