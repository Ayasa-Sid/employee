package com.example.service;
import com.example.entity.Task;
import com.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    public TaskRepository taskrepository;



    public Task saveTask(Task task) {
        return this.taskrepository.save(task);
    }

    public List<Task > getAllTask() {
        return this.taskrepository.findAll();
    }


    public Task getTaskById(int taskId) {
        return this.taskrepository.findById(taskId).orElse(null);
    }


    public Task updateTask(Task task) {
        return this.taskrepository.save(task);
    }

//    public void deleteTask(int id) {
//        this.taskrepository.deleteById(id);
//    }

}
