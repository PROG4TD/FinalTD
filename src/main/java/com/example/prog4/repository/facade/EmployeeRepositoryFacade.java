package com.example.prog4.repository.facade;

import com.example.prog4.controller.mapper.EmployeeMapper;
import com.example.prog4.model.CnapsEmployee;
import com.example.prog4.model.Employee;
import com.example.prog4.model.exception.NotFoundException;
import com.example.prog4.repository.CnapsRepository;
import com.example.prog4.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@AllArgsConstructor
public class EmployeeRepositoryFacade implements UserConnectorRepository {
    private final EmployeeRepository employeeRepository;
    private final CnapsRepository cnapsEmployeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public com.example.prog4.repository.entity.Employee findById(String id) {
        com.example.prog4.repository.entity.Employee employee = employeeRepository.findById(id).orElseThrow(() -> new NotFoundException("Not found id=" + id));
        CnapsEmployee cnapsEmployee = cnapsEmployeeRepository.findByEndToEndId(id);
        return employeeMapper.toCnapsEmployeeView(employee,cnapsEmployee);
    }



    @Override
    public void save(com.example.prog4.repository.entity.Employee employee) {
        employee.setCnaps(null);
        employeeRepository.save(employee);
    }
}