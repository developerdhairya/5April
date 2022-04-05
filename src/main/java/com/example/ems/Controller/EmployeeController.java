package com.example.ems.Controller;


import com.example.ems.Model.Employee;
import com.example.ems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService ems;


    @GetMapping("/")
    public List<Employee> getEmp () {
        return ems.getEmp();
    }
}
