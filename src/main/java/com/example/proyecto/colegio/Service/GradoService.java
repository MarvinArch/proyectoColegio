package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.GradoRepository;
import com.example.proyecto.colegio.model.GradoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GradoService {
    @Autowired
    private GradoRepository repository;

    public List<GradoModel> getAllGrados(){
        return (ArrayList<GradoModel>) repository.findAll();
    }

    public GradoModel saveNewGrado( GradoModel model){
        return repository.save(model);
    }

    public Optional<GradoModel> findById(Long id){
        return repository.findById(id);
    }
}
