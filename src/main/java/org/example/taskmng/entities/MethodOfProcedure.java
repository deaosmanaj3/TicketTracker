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
@Table(name = "method_of_procedure")
public class MethodOfProcedure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mop_id")
    private int mopId;

    @ManyToOne
    @JoinColumn(name = "inxh_id")
    private Inxhinier inxhinier;

    private String mopDescription;
    private String status;
}