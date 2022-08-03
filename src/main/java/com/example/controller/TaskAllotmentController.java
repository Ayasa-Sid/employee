package com.example.controller;

import com.example.entity.TaskAllotment;
import com.example.service.TaskAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v3")
public class TaskAllotmentController {
    @Autowired
    public TaskAllotmentService taskAllotmentService;


    @PostMapping("/putTaskAllotment")
    public TaskAllotment putTaskAllotment(@RequestBody TaskAllotment taskAllotment) {
        return this.taskAllotmentService.saveTaskAllotment(taskAllotment);}

    @GetMapping("/allTaskAllotment")
    public List<TaskAllotment> findALLTaskAllotment() {
        return this.taskAllotmentService.getAllTaskAllotment();
    }

    @GetMapping("/taskAllotment/{taskallotmentId}")
    public TaskAllotment findTaskAllotmentById(@PathVariable int taskallotmentId) {
        return this.taskAllotmentService.getTaskAllotmentById(taskallotmentId);}

    @PutMapping("/tsupdate")
    public TaskAllotment updateTaskAllotment(@RequestBody TaskAllotment taskAllotment) {
        return this.taskAllotmentService.updateTaskAllotment(taskAllotment);}


}
