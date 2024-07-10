/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);


        dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));
        dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));

        dept.addEmployee(new SalariedEmployee("Tyrone", LocalDate.of(2002, 1, 1),1800));

        dept.addEmployee(new HourlyEmployee("Liam", LocalDate.of(1991, 12, 12),95.0, 78.0));


        System.out.println("\nList employees:");
        dept.listEmployees();


        System.out.println("\nMake employees work:");
        dept.workEmployees();
    }
}