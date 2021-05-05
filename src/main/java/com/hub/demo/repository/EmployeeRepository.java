package com.hub.demo.repository;

import com.hub.demo.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {

}
