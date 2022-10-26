package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class EmployeeRepository {
       private List<Employee> employees= Arrays.asList(new Employee("shall"),new Employee("Bharat")) ;

       /* return List.of(new Employee("shai",
                "Bharat"));*/
      public List<Employee> getAllEmployees()
    {
                  return employees;
    }

}
