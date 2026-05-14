package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Hello API
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from lcal";
    }

    // Bye API
    @GetMapping("/bye")
    public String sayBye() {
        return "Bye from lcal";
    }

    // Bye API
    @GetMapping("/hello1")
    public String sayHellow1() {
        return "Bye from lcal";
    }
}
