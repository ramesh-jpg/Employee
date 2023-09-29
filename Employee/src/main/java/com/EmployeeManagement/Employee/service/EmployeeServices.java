package com.EmployeeManagement.Employee.service;

import com.EmployeeManagement.Employee.entity.Employee;
import com.EmployeeManagement.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee>getallEmp(){
        return employeeRepository.findAll();
    }
    public Employee getoneEmp(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee createEmp(Employee employee){
        return employeeRepository.save(employee);
    }
    public void deleteEmp(Long id){
         employeeRepository.deleteById(id);
    }
    public Employee updateEmp(Long id,Employee employee){
        if (employeeRepository.existsById(id)){
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        else
            return null;


    }

}
