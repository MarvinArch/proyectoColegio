package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Long> {
}
