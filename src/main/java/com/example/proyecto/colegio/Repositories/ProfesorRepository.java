package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.ProfesorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository  extends JpaRepository<ProfesorModel, Long> {
}
