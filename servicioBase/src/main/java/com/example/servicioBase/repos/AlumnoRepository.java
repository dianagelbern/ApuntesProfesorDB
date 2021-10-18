package com.example.servicioBase.repos;

import com.example.servicioBase.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
