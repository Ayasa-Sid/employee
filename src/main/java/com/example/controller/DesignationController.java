package com.example.controller;

import com.example.entity.Designation;
import com.example.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v3")
public class DesignationController {



    @Autowired
    public DesignationService designationService;

    @PostMapping("/putDesignation")
    public Designation putDesignation(@RequestBody Designation designation) {
        return this.designationService.saveDesignation(designation);
    }

    @GetMapping("/allDesignation")
    public List<Designation> findALLDesignation(){
        return this.designationService.getAllDesignation();}

    @GetMapping(value = "/designation/{designationId}")
    public Designation findDesignationById(@PathVariable int designationId) {
        return this.designationService.getDesignationById(designationId);}

    @PutMapping("/updateD")
    public Designation updateDesignation(@RequestBody Designation designation) {
        return this.designationService.updateDesignation(designation);
    }

}
