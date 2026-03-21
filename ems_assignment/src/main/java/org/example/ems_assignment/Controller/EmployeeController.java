package org.example.ems_assignment.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.ems_assignment.DTO.EmployeeDTO;
import org.example.ems_assignment.Entity.Employee;
import org.example.ems_assignment.Mapper.EmployeeMapper;
import org.example.ems_assignment.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public EmployeeDTO createEmployee(@Valid @RequestBody EmployeeDTO dto) {
        Employee emp = EmployeeMapper.toEntity(dto);
        return EmployeeMapper.toDTO(service.saveEmployee(emp));
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return service.getAllEmployees()
                .stream()
                .map(EmployeeMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable Long id) {
        return EmployeeMapper.toDTO(service.getEmployeeById(id));
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id,
                                      @Valid @RequestBody EmployeeDTO dto) {

        Employee emp = EmployeeMapper.toEntity(dto);
        return EmployeeMapper.toDTO(service.updateEmployee(id, emp));
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}