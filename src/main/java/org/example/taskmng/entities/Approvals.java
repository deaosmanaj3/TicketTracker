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
@Table(name = "approvals")
public class Approvals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private int appId;
    private String type;
    private boolean expedite;
    private String projectManager;
    private String status;

    @ManyToOne
    @JoinColumn(name = "crq_id")
    private ChangeRequest changeRequest;
}

