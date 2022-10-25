package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeRepository RP=new EmployeeRepository();

    @GetMapping("/employee")
    public List<Employee> employeeName()
    {
        return RP.employeeName();

    }

}
