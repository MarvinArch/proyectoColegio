package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.estudianteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface estudianteRepository extends JpaRepository<estudianteModel, Long> {
}
