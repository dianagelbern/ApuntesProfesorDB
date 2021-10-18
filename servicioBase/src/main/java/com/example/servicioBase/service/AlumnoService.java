package com.example.servicioBase.service;

import com.example.servicioBase.model.Alumno;
import com.example.servicioBase.repos.AlumnoRepository;
import com.example.servicioBase.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService extends BaseService<Alumno, Long, AlumnoRepository> {
}
