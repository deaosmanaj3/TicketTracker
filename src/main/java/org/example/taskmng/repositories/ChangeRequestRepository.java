package org.example.taskmng.repositories;


import org.example.taskmng.entities.ChangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRequestRepository extends JpaRepository<ChangeRequest,Integer> {
}
