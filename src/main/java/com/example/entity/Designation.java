package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Designation_table")
public class Designation {
    @Id
    private int designationId;
    private String designationAs;


}
