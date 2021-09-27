package com.salesianostriana.dam.e02ejercicio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MonumentoRepository //Usamos el nombre de la entidad + la palabra Repository
        extends JpaRepository<Monumento, Long> { //JpaRepository proporciona métodos relacionados con JPA, dentro de los piquitos van la entidad a la que hacemos referencia y su identificador
}
