package com.example.proyecto.colegio.Controller;

import com.example.proyecto.colegio.DTO.NuevoGradoDTO;
import com.example.proyecto.colegio.Service.GradoService;
import com.example.proyecto.colegio.model.GradoModel;
import com.example.proyecto.colegio.model.ProfesorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("grado")
public class GradoRest {
    @Autowired
    private GradoService service;

    @GetMapping("")
    public List<GradoModel> getAllGrado(){
        return service.getAllGrados();
    }
    @PostMapping("")
    public GradoModel saveNewGrado(@RequestBody NuevoGradoDTO model){
        ProfesorModel encargado= new ProfesorModel();
        encargado.setIdentificacion(model.getIdentificacionProfesorEncargado());
        GradoModel NuevoGrado = new GradoModel(model.getId(), model.getNombreGrado(), encargado);

        return service.saveNewGrado(NuevoGrado);
    }

    @GetMapping("/{id}")
    public GradoModel buscarGrado(@PathVariable Long id){
        Optional<GradoModel> buscar = service.findById(id);
        if (buscar.isPresent()) return buscar.get();
        return null;
    }
}
