package com.salesianostriana.dam.e02ejercicio;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Lo transformamos en un controlarod REST
@RequiredArgsConstructor //Sirve para que se puedan hacer inyección de dependencias
@RequestMapping("/monumento")  //Devuelve la ruta base
public class MonumentoController {

    private final MonumentoRepository repository; //inicializamos la entidad


    //Devuelve la lista de monumentos con el código 200. (lista doso los monumentos)
    @GetMapping("/")
    public ResponseEntity<List<Monumento>> findAll() {

        return ResponseEntity
                .ok()
                .body(repository.findAll());

    }

    //Este método nos muestra un monumento por medio de su id
    @GetMapping("/{id}")
    public ResponseEntity<Monumento> findOne(@PathVariable Long id) { //Podemos ponerle otro identificador distinto con la anotacion @PathVariable("id")

        /*return ResponseEntity
                .ok()
                .body(repository.findById(id).orElse(null)); //Otra forma un poco más larga de pedir lo mismo, en u futuro cambiaremos el null por un 404
        */

        return ResponseEntity
                .of(repository.findById(id)); //Es una forma resumida de pedirle que devuelva un código de estado 200 mas el mensaje del cuerpo

    }

    //Método que nos ayuda a crear un nuevo monumento
    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento nuevo) {

        return ResponseEntity
                .status(HttpStatus.CREATED) //Devuelve el código de estado 201
                .body(repository.save(nuevo));

    }

    //Método que edita
    @PutMapping("/{id}")
    public ResponseEntity<Monumento> edit(
            @RequestBody Monumento e,
            @PathVariable Long id) {

        return ResponseEntity.of(
            repository.findById(id).map(m -> { //findById devuelve un optional que nos permite trabajar con lambdas
               m.setCodigoPais(e.getCodigoPais());
               m.setPais(e.getPais());
               m.setCiudad(e.getCiudad());
               m.setDescripcion(e.getDescripcion());
               m.setLoc(e.getLoc());
               m.setNombre(e.getNombre());
               m.setUrlImagen(e.getUrlImagen());
               repository.save(m); //Para no hacer tan grande el método y poner llaves sobre llaves podemos simplemente escribir esto justo al final
               return m;
            })
        );

    }

    //Método que elimina un monumento
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build(); //noContent crea un builder con el código 204. Debemos cerrar con .build()
    }


}
