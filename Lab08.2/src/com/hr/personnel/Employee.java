/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 * <p>
 * Properties:
 * String name
 * LocalDate hireDate
 * <p>
 * Methods (excluding get/set methods):
 * void work()        simulates work by printing a message to show it was called.
 * String toString()  self-explanatory.
 */
public abstract class Employee {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
    }

    public Employee(String name, LocalDate hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    // business methods started on July 9, 2024
    // all Employees work(), so the method goes up here
    // They all work() the same way, i.e. "hard", so Jay says to code in the base class
    // It is inherited by both subclass and not overwritten.

    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    // All employees get paid, so the method goes up here, but they don't do it all the same way.
    public abstract void pay();

    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: name=" + getName() + ", hireDate=" + getHireDate();
    }
}