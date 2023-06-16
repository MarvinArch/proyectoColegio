package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.AlumnoRepository;
import com.example.proyecto.colegio.model.AlumnoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository repository;

    public List<AlumnoModel> getAllAlumno(){
        return (ArrayList<AlumnoModel>) repository.findAll();
    }

    public AlumnoModel saveAlumno(AlumnoModel model){
        model.getDatosGenerales().setProfesor(false);
        return repository.save(model);
    }


}
