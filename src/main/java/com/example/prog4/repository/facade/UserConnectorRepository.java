package com.example.prog4.repository.facade;


import com.example.prog4.repository.entity.Employee;

public interface UserConnectorRepository {

    Employee findById(String id);

    void save(Employee employee);

}
