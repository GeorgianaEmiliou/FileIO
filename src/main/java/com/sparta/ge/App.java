package com.sparta.ge;

import com.sparta.ge.dao.EmployeeDAO;
import com.sparta.ge.dto.EmployeeDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//1. Storing of Employee Data
//2. Iteration - Filtering


public class App {
    public static void main( String[] args ) {

        EmployeeDAO.populateArray("EmployeeRecords.csv");
        System.out.println(EmployeeDAO.getEmployees().get(0).getLastName());

        //Testing
        //1. Overall system - Integration Testing
        //2. Individual parts - Unit Testing

    }
}
