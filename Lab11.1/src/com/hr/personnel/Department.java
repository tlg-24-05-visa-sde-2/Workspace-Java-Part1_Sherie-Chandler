/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees the Employees in this department.
 *   Int currentIndex internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 *   void listEmployees() print info on all employees in the department.
 *   Void workEmployees() make all employees in the department work.
 *   String toString() self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;

    // this a 1-to-Many relationships

    private final Collection<Employee> employees = new ArrayList<>();

    // Ctors
    public Department() {
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // Business Methods or Actions
    public void listEmployees() {

        for (Employee emp : employees) {
            System.out.println(emp);
        }
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            employees.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            employees.pay();
        }
    }

    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i] instanceof SalariedEmployee salariedEmployee) {
                salariedEmployee.takeVacation();
            }
        }
    }

    // Use a helper method to add an array to Employee

    public void addEmployee(Employee emp) {
        employees.add(emp);


    // Accessor Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}