package br.com.animalsservice.repositories;

import br.com.animalsservice.entidades.AnimaisResgatados;
import br.com.animalsservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    @Query("SELECT a from Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a from Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT new br.com.animalsservice.entidades.AnimaisResgatados(a.nomeRecebedor,COUNT(*),:dataInicio, :dataFim)" +
            "FROM Animal AS a  WHERE a.dataEntrada BETWEEN :dataInicio AND :dataFim GROUP BY a.nomeRecebedor")
    List<AnimaisResgatados> findRescuedAnimalsByMemberName(@Param("dataInicio") LocalDate dataInicio, @Param("dataFim") LocalDate dataFim);
}
