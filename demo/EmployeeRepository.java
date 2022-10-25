package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class EmployeeRepository {
    public List<Employee> employeeName() {
        return List.of(new Employee("shai",
                "Bharat"));
    }

}
