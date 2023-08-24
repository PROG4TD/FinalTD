package com.example.prog4.repository.cnaps;

import com.example.prog4.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RepositoryImpl{
    private final EmployeeRepository employeeRepository;
    private final CnapsRepository cnapsRepository;

    @Autowired
    public RepositoryImpl(EmployeeRepository employeeRepository, CnapsRepository cnapsRepository) {
        this.employeeRepository = employeeRepository;
        this.cnapsRepository = cnapsRepository;
    }
}
