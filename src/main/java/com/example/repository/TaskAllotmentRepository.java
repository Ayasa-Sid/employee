package com.example.repository;

import com.example.entity.TaskAllotment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskAllotmentRepository extends JpaRepository<TaskAllotment,Integer > {
}
