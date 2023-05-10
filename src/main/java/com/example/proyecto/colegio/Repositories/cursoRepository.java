package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.cursoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cursoRepository extends JpaRepository<cursoModel, Long> {
}
