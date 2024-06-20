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
@Table(name = "inxhinier")
public class Inxhinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inxh_id")
    private int inxhId;
    private String name;
    private String surname;
    private boolean status;
}