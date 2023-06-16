package com.example.proyecto.colegio.Service;

import com.example.proyecto.colegio.Repositories.TemaContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaContenidoService {
    @Autowired
    private TemaContenidoRepository repository;
}
