package com.example.ems.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class EmpController {
    EmpService ems;
   @Autowired
    public EmpController(EmpService ems) {
        this.ems = ems;
    }

    @Autowired


    @GetMapping
    public List<Emp> getEmp () {
        return ems.getEmp();
    }
}
