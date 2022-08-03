package com.example.controller;

import com.example.entity.Project;
import com.example.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v3")
public class ProjectController {

   @Autowired
   public ProjectService projectService;

    @PostMapping("/putProject")
    public Project putProject(@RequestBody Project project) {
        return this.projectService.saveProject(project);
    }

    @GetMapping("/allProject")
    public List<Project> findALLProject() {
        return this.projectService.getAllProject();
    }

    @GetMapping("/project/{projectId}")
    public Project findProjectById(@PathVariable int projectId) {
        return this.projectService.getProjectById(projectId);}

    @PutMapping("/pUpdate")
    public Project updateProject(@RequestBody Project project) {
        return this.projectService.updateProject(project);
    }

}
