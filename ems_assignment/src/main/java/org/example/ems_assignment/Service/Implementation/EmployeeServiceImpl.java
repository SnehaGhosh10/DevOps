package org.example.ems_assignment.Service.Implementation;

import lombok.RequiredArgsConstructor;
import org.example.ems_assignment.Entity.Employee;
import org.example.ems_assignment.Repository.EmployeeRepository;
import org.example.ems_assignment.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existing = getEmployeeById(id);

        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setPhone(employee.getPhone());
        existing.setGender(employee.getGender());
        existing.setDesignation(employee.getDesignation());
        existing.setSalary(employee.getSalary());
        existing.setDateOfJoining(employee.getDateOfJoining());
        existing.setAddress(employee.getAddress());

        return repository.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee emp = getEmployeeById(id);
        repository.delete(emp);
    }
}
