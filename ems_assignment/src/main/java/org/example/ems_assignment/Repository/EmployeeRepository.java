package org.example.ems_assignment.Repository;

import org.example.ems_assignment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
