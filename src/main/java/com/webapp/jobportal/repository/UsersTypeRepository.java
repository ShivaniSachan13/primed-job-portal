package com.webapp.jobportal.repository;

import com.webapp.jobportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
    Optional<UsersType> findByUserTypeName(String userTypeName);
}
