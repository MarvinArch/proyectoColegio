package com.example.proyecto.colegio.Controller;

import com.example.proyecto.colegio.DTO.ProfesorDTO;
import com.example.proyecto.colegio.Service.ProfesorService;
import com.example.proyecto.colegio.model.ProfesorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesor")
public class ProfesorRest {
    @Autowired
    private ProfesorService service;
    @GetMapping("")
    public List<ProfesorModel> getAllProfesro(){
        return service.getAll();
    }

    //este metodo hay que pulirlo aun crea recursividad
    @GetMapping("/{id}")
    public ProfesorDTO findById(@PathVariable Long id){
        Optional<ProfesorModel> buscar= service.getById(id);
        if (buscar.isPresent()) {
            ProfesorDTO profesorDTO = new ProfesorDTO(buscar.get().getIdentificacion(),buscar.get().getNoCuenta(), buscar.get().getProfesion()
            , buscar.get().getDatosGenerales(), buscar.get().getProfesorCurso());
            return profesorDTO;
        }
        return null;
    }
}
