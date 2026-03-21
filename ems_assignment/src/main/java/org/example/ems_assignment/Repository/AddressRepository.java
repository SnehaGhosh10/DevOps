package org.example.ems_assignment.Repository;

import org.example.ems_assignment.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
