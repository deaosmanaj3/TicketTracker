package org.example.taskmng.repositories;


import org.example.taskmng.entities.MethodOfProcedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodOfProcedureRepository extends JpaRepository<MethodOfProcedure, Integer> {
}
