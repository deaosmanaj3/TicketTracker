package org.example.taskmng.repositories;



import org.example.taskmng.entities.Approvals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalsRepository extends JpaRepository<Approvals, Integer> {
}
