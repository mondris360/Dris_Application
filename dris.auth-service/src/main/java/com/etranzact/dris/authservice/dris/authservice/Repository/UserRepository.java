package com.etranzact.dris.authservice.dris.authservice.Repository;

import com.etranzact.dris.authservice.dris.authservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getByEmail(String email);
}
