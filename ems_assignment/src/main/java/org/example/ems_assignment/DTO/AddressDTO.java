package org.example.ems_assignment.DTO;

import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;

    @Pattern(regexp = "\\d{6}", message = "Pincode must be 6 digits")
    private String pincode;
}