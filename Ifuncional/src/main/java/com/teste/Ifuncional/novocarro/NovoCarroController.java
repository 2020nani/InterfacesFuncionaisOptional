package com.teste.Ifuncional.novocarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
public class NovoCarroController {

    private CarroRepository carrorepository;

    @Autowired
    public NovoCarroController(CarroRepository carrorepository) {
        this.carrorepository = carrorepository;
    }

    @PostMapping("/carros")
    public void criaCarro(@RequestBody @Valid NovoCarroForm novocarroform){
        NovoCarro carro = novocarroform.converte();
        carrorepository.save(carro);

    }

    @GetMapping("/carros/{id}")
    public ResponseEntity<?> listaCarro(@PathVariable("id") Long id){

        Optional<NovoCarro> carros = carrorepository.findById(id);
        return carros
                .filter(car -> car.getMarca().equals("volks"))
                .map(car -> new NovoCarroDto(car) )
                .map(carResponse -> ResponseEntity.ok().body(carResponse))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
                //.orElseGet(() -> ResponseEntity.notFound().build());


    }


}
