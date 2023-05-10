package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.instructorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface instructorRepository extends JpaRepository<instructorModel, Long> {
}
