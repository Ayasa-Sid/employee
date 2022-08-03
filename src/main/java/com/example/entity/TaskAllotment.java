package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TaskAllotment_table")
public class TaskAllotment {

    @Id
    private int taskallotmentId;
    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name="taskId",referencedColumnName = "taskId")
    private Task task;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employeeId",referencedColumnName = "employeeId" )
    private Employee employee;
    private  String ranking;
    private  String feedback;
    private  String status;
    private  String startDate;
    private String endDate;
}
