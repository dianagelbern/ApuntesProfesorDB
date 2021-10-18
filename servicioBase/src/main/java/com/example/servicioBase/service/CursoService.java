package com.example.servicioBase.service;

import com.example.servicioBase.model.Curso;
import com.example.servicioBase.repos.CursoRepository;
import com.example.servicioBase.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CursoService extends BaseService<Curso, Long, CursoRepository> {
}
