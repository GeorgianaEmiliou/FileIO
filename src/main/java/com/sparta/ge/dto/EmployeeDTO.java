package com.sparta.ge.dto;

//DTO - Data Transfer Object
//Emp ID,Name Prefix,First Name,Middle Initial,Last Name,
// Gender,E Mail,Date of Birth,Date of Joining,Salary
//198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,
// 9/21/1982,02/01/2008,69294


//Read as String - Convert getters
//Read correct type - convert constructor

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeDTO {
    private String empID;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Float salary;

    public EmployeeDTO( String[] csvInput) {
        empID = csvInput[0];
        namePrefix = csvInput[1];
        firstName = csvInput[2];
        middleInitial = csvInput[3];
        lastName = csvInput[4];
        gender = csvInput[5];
        email = csvInput[6];
        this.dateOfBirth = LocalDate.parse(csvInput[7], DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.dateOfJoining= LocalDate.parse(csvInput[8], DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.salary = Float.valueOf(csvInput[9]);
    }


    public String getEmpID() {
        return empID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public Float getSalary() {
        return salary;
    }
}
