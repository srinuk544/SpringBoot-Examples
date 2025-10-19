package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// Custom query methods (Spring Data JPA auto-implements these)
	List<com.spring.entity.Employee> findByDepartment(String department);
}
