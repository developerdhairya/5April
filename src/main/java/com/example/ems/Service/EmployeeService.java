package com.example.ems.Service;

import com.example.ems.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Service
public class EmployeeService {

  public List<Employee> getEmp() {

    List<Employee> output=new ArrayList<>();
    output.add(new Employee(1,"","","","",1));
    return output;
  }
}
