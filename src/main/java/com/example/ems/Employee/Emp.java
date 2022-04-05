package com.example.ems.Employee;

import java.time.LocalDate;

public class Emp {
    Long id;
 String name ;
 String email;
 String department;
 String designation;
 Integer age;
 LocalDate dob;

    public Emp() {
    }

    public Emp(Long id, String name, String email, String department, String designation, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.age = age;
        this.dob = dob;
    }
    public Emp( String name, String email, String department, String designation, Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.age = age;
        this.dob = dob;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
