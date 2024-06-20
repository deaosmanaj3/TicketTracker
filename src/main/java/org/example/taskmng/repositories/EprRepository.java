package org.example.taskmng.repositories;


import org.example.taskmng.entities.EPR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EprRepository extends JpaRepository<EPR, Integer> {
}
