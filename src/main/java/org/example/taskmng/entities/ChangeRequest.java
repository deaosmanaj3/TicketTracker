package org.example.taskmng.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "change_request")
public class ChangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crq_id")
    private int crqId;
    private String eng;
    private int dueDate;
    private Date dateToSchedule;
    private Time duration;

    @OneToMany(mappedBy = "changeRequest")
    private List<Approvals> approvalsList;

    @OneToMany(mappedBy = "changeRequest")
    private List<ISPtask> isptaskList;


}