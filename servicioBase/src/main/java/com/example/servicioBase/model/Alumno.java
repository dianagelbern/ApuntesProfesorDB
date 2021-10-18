package com.example.servicioBase.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@Builder
public class Alumno implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellido, email;

    @ManyToOne
    @JoinColumn(name = "curso", foreignKey = @ForeignKey(name = "FK_ALUMNO_CURSO"))
    private Curso curso;


}
