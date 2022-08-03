package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee_Table")


public class Employee{

    @Id
    private int employeeId;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="designationId", referencedColumnName = "designationId")
    private Designation designation;
    private String employeeName;
    private long employeePhone;
    private String address;
    private long postalCode;
    private String startDate;
    private  String endDate;
    private String status;
}
