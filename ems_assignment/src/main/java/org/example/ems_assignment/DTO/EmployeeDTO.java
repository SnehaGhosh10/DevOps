package org.example.ems_assignment.DTO;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
    private String phone;

    private String gender;
    private String designation;

    @Positive(message = "Salary must be greater than 0")
    private double salary;

    private LocalDate dateOfJoining;

    private AddressDTO address;
}