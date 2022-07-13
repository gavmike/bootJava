package ru.javaops.bootjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javaops.bootjava.model.Address;

public interface AddressRepository extends JpaRepository<Address, String> {

    Address findById(Integer Id);
}
