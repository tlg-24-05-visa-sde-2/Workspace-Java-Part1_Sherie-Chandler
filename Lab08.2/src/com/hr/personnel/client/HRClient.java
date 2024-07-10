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
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);


        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1250.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 50.0, 40.0));
        dept.addEmployee(new SalariedEmployee("Tyrone", LocalDate.of(2002, 1, 1), 1800));
        dept.addEmployee(new HourlyEmployee("Liam", LocalDate.of(1991, 12, 12), 95.0, 78.0));

// list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

// list its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all Employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nHoliday break");
    }
}