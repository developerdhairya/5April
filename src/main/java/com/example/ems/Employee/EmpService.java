package com.example.ems.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;
@Service
public class EmpService {
  public List<Emp> getEmp() {
      return List.of(new Emp(
              "Anirudh Sharma",
              "anirudh@gmail.com",
              "Software",
              "Associate Software Developer",
              21,
              LocalDate.of(2001,5,5)
      ));
  }
}
