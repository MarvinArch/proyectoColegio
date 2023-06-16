package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    @Autowired
    private TareaRepository repository;
}
