package com.example.proyecto.colegio.Controller;

import com.example.proyecto.colegio.Service.CursoService;
import com.example.proyecto.colegio.model.CursoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoRest {
    @Autowired
    private CursoService service;

    @GetMapping("")
    public List<CursoModel> getAllCursos(){
        return service.geAll();
    }

    @PostMapping("")
    public CursoModel saveCurso(@RequestBody CursoModel model){
        return service.saveCurso(model);
    }
}
