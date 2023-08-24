package com.example.prog4.repository.cnaps;

import com.example.prog4.model.cnaps.CnapsEmployee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CnapsRepository extends JpaRepository<CnapsEmployee, String> {
}