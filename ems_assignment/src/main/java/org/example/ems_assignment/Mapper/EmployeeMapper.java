package org.example.ems_assignment.Mapper;

import org.example.ems_assignment.DTO.AddressDTO;
import org.example.ems_assignment.DTO.EmployeeDTO;
import org.example.ems_assignment.Entity.Address;
import org.example.ems_assignment.Entity.Employee;

public class EmployeeMapper {

    // Entity → DTO
    public static EmployeeDTO toDTO(Employee emp) {

        AddressDTO addressDTO = null;

        if (emp.getAddress() != null) {
            addressDTO = new AddressDTO(
                    emp.getAddress().getId(),
                    emp.getAddress().getStreet(),
                    emp.getAddress().getCity(),
                    emp.getAddress().getState(),
                    emp.getAddress().getCountry(),
                    emp.getAddress().getPincode()
            );
        }

        return new EmployeeDTO(
                emp.getId(),
                emp.getName(),
                emp.getEmail(),
                emp.getPhone(),
                emp.getGender(),
                emp.getDesignation(),
                emp.getSalary(),
                emp.getDateOfJoining(),
                addressDTO
        );
    }

    // DTO → Entity (🔥 FIXED)
    public static Employee toEntity(EmployeeDTO dto) {

        Address address = null;

        if (dto.getAddress() != null) {
            address = new Address();
            address.setId(dto.getAddress().getId());
            address.setStreet(dto.getAddress().getStreet());
            address.setCity(dto.getAddress().getCity());
            address.setState(dto.getAddress().getState());
            address.setCountry(dto.getAddress().getCountry());
            address.setPincode(dto.getAddress().getPincode());
        }

        Employee emp = new Employee();
        emp.setId(dto.getId());
        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setPhone(dto.getPhone());
        emp.setGender(dto.getGender());
        emp.setDesignation(dto.getDesignation());
        emp.setSalary(dto.getSalary());
        emp.setDateOfJoining(dto.getDateOfJoining());
        emp.setAddress(address);

        return emp;
    }
}