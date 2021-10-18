package com.example.servicioBase.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre, tutor;

    public Curso (String nombre, String tutor){
        this.nombre = nombre;
        this.tutor = tutor;
    }



}
