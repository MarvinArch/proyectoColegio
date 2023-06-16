package com.example.proyecto.colegio.DTO;

import com.example.proyecto.colegio.model.CursoModel;
import com.example.proyecto.colegio.model.PersonaModel;
import lombok.Data;

import java.util.List;

@Data
public class ProfesorDTO {
    private Long identificacion;
    private String noCuenta;
    private String profesion;
    private PersonaModel datosGenerales;
    private List<CursoModel> profesorCurso;

    public ProfesorDTO(Long identificacion, String noCuenta, String profesion, PersonaModel datosGenerales) {
        this.identificacion = identificacion;
        this.noCuenta = noCuenta;
        this.profesion = profesion;
        this.datosGenerales = datosGenerales;
    }
}
