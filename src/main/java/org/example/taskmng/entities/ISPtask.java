package org.example.taskmng.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "isptask")
public class ISPtask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int taskId;
    private String ispTask;
    private String engineerAssigned;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "crq_id")
    private ChangeRequest changeRequest;
}