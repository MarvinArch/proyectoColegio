package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.ProfesorRepository;
import com.example.proyecto.colegio.model.ProfesorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepositor;

    public List<ProfesorModel> getAll(){
        return (ArrayList<ProfesorModel>)profesorRepositor.findAll();
    }

    public Optional<ProfesorModel> getById(Long id){
        return profesorRepositor.findById(id);
    }
}
