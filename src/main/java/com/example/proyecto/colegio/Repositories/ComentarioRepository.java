package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {
}
