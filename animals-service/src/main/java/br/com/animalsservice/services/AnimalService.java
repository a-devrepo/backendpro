package br.com.animalsservice.services;

import br.com.animalsservice.entidades.AnimaisResgatados;
import br.com.animalsservice.entidades.Animal;
import br.com.animalsservice.repositories.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public Animal create(Animal animal) {
        return repository.save(animal);
    }

    public List<Animal> findAll() {
        return repository.findAll();
    }

    public List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    public List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    public List<AnimaisResgatados> findRescuedAnimalsGroupedByMemberName(LocalDate dataInicio, LocalDate dataFim) {
        return repository.findRescuedAnimalsByMemberName(dataInicio, dataFim);
    }
}
