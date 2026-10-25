package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy= "department")
    private List<Employee> employees= new ArrayList<>();

    public void addEmployee(Employee employee){
        employee.setDepartment(this);
        this.employees.add(employee);

    }

}
