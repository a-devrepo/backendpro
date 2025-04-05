package br.com.animalsservice.controllers;

import br.com.animalsservice.entidades.AnimaisResgatados;
import br.com.animalsservice.entidades.Animal;
import br.com.animalsservice.services.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    private List<Animal> findAll() {
        return service.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return service.create(animal);
    }

    @GetMapping("/not-adopted")
    public List<Animal> findNotAdopted() {
        return service.findNotAdopted();
    }

    @GetMapping("/adopted")
    public List<Animal> findAdopted() {
        return service.findAdopted();
    }

    @GetMapping("/rescued/{initdate}/{enddate}")
    public List<AnimaisResgatados> findRescuedAnimalsByMemberName(@PathVariable("initdate") LocalDate initDate, @PathVariable("enddate") LocalDate endDate) {
        return service.findRescuedAnimalsByMemberName(initDate, endDate);
    }
}
