package ru.javaops.bootjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javaops.bootjava.model.UserDetails;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {
   
   List<UserDetails> findByNameContaining(String text);
   List<UserDetails> findAllBy();
   UserDetails findById(Integer id);


}