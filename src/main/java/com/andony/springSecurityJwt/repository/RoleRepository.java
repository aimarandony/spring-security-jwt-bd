package com.andony.springSecurityJwt.repository;

import com.andony.springSecurityJwt.model.ERole;
import com.andony.springSecurityJwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
