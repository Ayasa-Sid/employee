package com.example.controller;

import com.example.entity.Task;
import com.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v3")
public class TaskController {

    @Autowired
    public TaskService taskService;


    @PostMapping("/putTask")
    public Task putTaskAllotment(@RequestBody Task task) {return this.taskService.saveTask(task);}

    @GetMapping("/allTask")
    public List<Task> findALLTask() {
        return this.taskService.getAllTask();
    }

    @GetMapping("/task/{taskId}")
    public Task findTaskById(@PathVariable int taskId) {return this.taskService.getTaskById(taskId);}

    @PutMapping("/tUpdate")
    public Task updateTask(@RequestBody Task task) {return this.taskService.updateTask(task);}
}
