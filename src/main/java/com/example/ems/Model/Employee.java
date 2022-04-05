package com.example.ems.Model;

//Use the commented things when dealing with jpa

//@Entity
public class Employee {



//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;

//    @Column(name = "name",nullable = false)
    String name;

//    @Column(name = "email",nullable = false)
    String email;

//    @Column(name = "department",nullable = false)
    String department;

//    @Column(name = "designation",nullable = false)
    String designation;
    
//    @Column(name = "age",nullable = false)
    int age;


    public Employee(int id, String name, String email, String department, String designation, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }
}
