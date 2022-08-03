package com.example.service;

import com.example.entity.TaskAllotment;
import com.example.repository.TaskAllotmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskAllotmentService {
    @Autowired
    public TaskAllotmentRepository taskAllotmentrepository;



    public TaskAllotment saveTaskAllotment(TaskAllotment taskAllotment) {
        return this.taskAllotmentrepository.save(taskAllotment);
    }

    public List<TaskAllotment> getAllTaskAllotment() {
        return this.taskAllotmentrepository.findAll();
    }


    public TaskAllotment getTaskAllotmentById(int taskAllotmentId) {
        return this.taskAllotmentrepository.findById(taskAllotmentId).orElse(null);
    }


    public TaskAllotment updateTaskAllotment(TaskAllotment taskAllotment) {
        return this.taskAllotmentrepository.save(taskAllotment);
    }

//    public void deleteTaskAllotment(int id) {
//        this.taskAllotmentrepository.deleteById(id);
//    }


}
