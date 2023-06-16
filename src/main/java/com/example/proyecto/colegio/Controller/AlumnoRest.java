package com.example.proyecto.colegio.Controller;

import com.example.proyecto.colegio.Service.AlumnoService;
import com.example.proyecto.colegio.model.AlumnoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Alumno")
public class AlumnoRest {
    @Autowired
    private AlumnoService service;
    @GetMapping("")
    public List<AlumnoModel> getAllAlemno(){
        return service.getAllAlumno();
    }
    @PostMapping("")
    public AlumnoModel SaveNewAlumno(@RequestBody AlumnoModel model){
        return service.saveAlumno(model);
    }

}
