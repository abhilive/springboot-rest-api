package com.abhilive.springboot_rest_api.repository;

import com.abhilive.springboot_rest_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
