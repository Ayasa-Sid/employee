package com.example.service;

import com.example.entity.Designation;
import com.example.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {

    @Autowired
    public DesignationRepository designationrepository;



    public Designation saveDesignation(Designation designation) {
        return this.designationrepository.save(designation);
    }

    public List<Designation> getAllDesignation() {
        return this.designationrepository.findAll();
    }


    public Designation getDesignationById(int designationId) {
        return this.designationrepository.findById(designationId).orElse(null);
    }


    public Designation updateDesignation(Designation designation) {
        return this.designationrepository.save(designation);
    }
//    public void deleteDesignation(int id) {
//    public void deleteDesignation(int id) {
//        this.designationrepository.deleteById(id);
//    }
}
