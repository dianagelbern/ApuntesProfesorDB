package com.salesianostriana.dam.e02ejercicio;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //Se usa porque hacemos referencia a una entidad
@Data  //Sirve para los getters, setters, equal, etc..
@NoArgsConstructor //Genera el constructor sin atributos
public class Monumento {

    @Id //Sirve para definir cual es la clave primaria
    @GeneratedValue //Sirve para autoincrementar el valor
    private Long id;

    private String codigoPais;

    private String pais;

    private String ciudad;

    private String loc;

    private String nombre;

    @Lob //vuelve el objeto más grande
    //@Column(length = 1000) //Este es otra opción que sirve también para hacer el objeto más grande
    //@Column(columnDefinition = "TEXT") //Está es otra opción igual de válida que las dos primeras para hacer el objeto más grande
    private String descripcion;

    private String urlImagen;



}
