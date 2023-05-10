package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.comentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface comentarioRepository extends JpaRepository<comentarioModel, Long> {
}
