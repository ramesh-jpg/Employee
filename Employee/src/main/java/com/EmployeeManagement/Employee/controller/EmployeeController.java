package com.EmployeeManagement.Employee.controller;

import com.EmployeeManagement.Employee.entity.Employee;
import com.EmployeeManagement.Employee.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/getall")
    public List<Employee>getallEmp(Long id){
        return employeeServices.getallEmp();
    }
    @GetMapping("/getone")
    public Employee getoneEmp(@PathVariable Long id){
        return employeeServices.getoneEmp(id);
    }
    @PostMapping("/create")
    public Employee createEmp(@RequestBody Employee employee){
        return employeeServices.createEmp(employee);
    }
    @PutMapping("/update")
    public Employee updateEmp(@PathVariable Long id,@RequestBody Employee employee){
        return employeeServices.updateEmp(id,employee);
    }
    @DeleteMapping("/delete")
    public void deleteEmp(@PathVariable Long id){
        employeeServices.deleteEmp(id);
    }
}
