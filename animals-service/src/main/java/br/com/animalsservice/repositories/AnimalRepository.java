package br.com.animalsservice.repositories;

import br.com.animalsservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
