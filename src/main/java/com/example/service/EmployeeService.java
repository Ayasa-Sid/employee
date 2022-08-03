package com.example.service;

import com.example.entity.Employee;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {


    @Autowired
    public EmployeeRepository employeerepository;



    public Employee saveEmployee(Employee employee) {
        return this.employeerepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return this.employeerepository.findAll();
    }


    public Employee getEmployeesById(int employeeId) {
        return this.employeerepository.findById(employeeId).orElse(null);
    }

    public Employee updateEmployee(Employee employee) {
        return this.employeerepository.save(employee);
    }

//    public void deleteEmployee(int employeeId) {
//        this.employeerepository.deleteById(employeeId);
//    }
}



