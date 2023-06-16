package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository repository;
}
