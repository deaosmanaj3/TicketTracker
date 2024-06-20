package org.example.taskmng.repositories;


import org.example.taskmng.entities.Inxhinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InxhinierRepository extends JpaRepository<Inxhinier, Integer> {
}
