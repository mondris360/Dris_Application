package com.mondris.demo.Repository;


import com.mondris.demo.Model.PhoneContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneContactRepository extends JpaRepository<PhoneContact, Long> {
}
