package com.example.proyecto.colegio.Repositories;

import com.example.proyecto.colegio.model.TareaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<TareaModel, Long> {
}
