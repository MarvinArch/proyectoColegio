package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.CursoRepository;
import com.example.proyecto.colegio.model.CursoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoModel> geAll(){
        return (ArrayList<CursoModel>)cursoRepository.findAll();
    }

    public CursoModel saveCurso(CursoModel model){
        return cursoRepository.save(model);
    }

}
