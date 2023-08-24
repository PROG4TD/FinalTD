package com.example.prog4.repository;


import com.example.prog4.model.CnapsEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnapsRepository extends JpaRepository<CnapsEmployee, String> {
    CnapsEmployee findByEndToEndId(String endToEndId);
}