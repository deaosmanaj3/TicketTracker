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
@Table(name = "epr")
public class EPR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eng")
    private int eng;
    private String epr;

    @OneToOne
    @JoinColumn(name = "crq_id")
    private ChangeRequest changeRequest;

    @OneToOne
    @JoinColumn(name = "mop_id")
    private MethodOfProcedure methodOfProcedure;
}