package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Task_table")
public class Task {
    @Id
    private int taskId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="projectId", referencedColumnName = "projectId")
    private Project project;
    private  String taskDesc;
}
