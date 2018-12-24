package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeEmailTest {

    @Test
    public void addEmployeeEmailId() {
        EmployeeEmail employeeEmail = new EmployeeEmail();
        employeeEmail.addEmployeeEmailId("xam@gmail.com");
    }


}
