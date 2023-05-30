package com.example.proyecto.colegio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Entity(name = "persona")
@Data
public class PersonaModel {
    @Id
    @Column(name = "carne_persona", nullable = false)
    private Long carnePersona;
    @Column(length = 120, nullable = false)
    private String nombres;
    @Column(length = 120)
    private String apellidos;
    @Column(length = 120)
    private String direccion;
    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;
    @Column (length = 25)
    private String telefono;
    @Column(length = 120)
    private String ciudad;
    @Column(nullable = false)
    private String contraseña;
    @Column(nullable = false)
    private boolean profesor;
    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "personaComentario")
    private List<ComentarioModel> comentariosPersona;

}
