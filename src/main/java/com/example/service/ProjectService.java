package com.example.service;

import com.example.entity.Project;
import com.example.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService {

    @Autowired
    public ProjectRepository projectrepository;


    public  Project saveProject( Project project) {
        return this.projectrepository.save(project);
    }

    public List< Project> getAllProject() {
        return this.projectrepository.findAll();
    }


    public  Project getProjectById(int projectId) {
        return this.projectrepository.findById(projectId).orElse(null);
    }


    public Project updateProject(Project project) {
        return this.projectrepository.save(project);
    }

//    public void deleteProject(int id) {
//        this.projectrepository.deleteById(id);
//    }

}
