package com.example.prog4.repository.cnaps;

import com.example.prog4.model.cnaps.CnapsEmployee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CnapsRepository extends JpaRepository<CnapsEmployee, String> {
    Optional<CnapsEmployee> findByPersonalEmail(String personalEmail);
}