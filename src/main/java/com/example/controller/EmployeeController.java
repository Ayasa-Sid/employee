package com.example.controller;


import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v3")
public class EmployeeController {


    @Autowired
   public EmployeeService employeeService;


    @PostMapping("/putEmployee")
    public Employee putEmployee(@RequestBody Employee employee) {
        return this.employeeService.saveEmployee(employee);
    }

    @GetMapping("/allEmployees")
   public List<Employee> findALLEmployee() {
       return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findEmployeeById(@PathVariable int employeeId) {
        return this.employeeService.getEmployeesById(employeeId);}

    @PutMapping("/eUpdate")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
   }




}


