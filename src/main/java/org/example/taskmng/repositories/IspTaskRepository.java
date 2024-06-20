package org.example.taskmng.repositories;


import org.example.taskmng.entities.ISPtask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IspTaskRepository extends JpaRepository<ISPtask, Integer> {
}
