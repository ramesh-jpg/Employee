package com.EmployeeManagement.Employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Emp_id")
    private Long id;
    @Column(name="Name")
    private String name;
    @Column(name="Gender")
    private String gender;
    @Column(name = "Location")
    private String location;

    public Employee() {
    }

    public Employee(Long id, String name, String gender, String location) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
