package com.example.proyecto.colegio.DTO;

import lombok.Data;

@Data
public class NuevoGradoDTO {
    private Long id;
    private String nombreGrado;
    private Long identificacionProfesorEncargado;

}
