package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // changed from super to this
        setSalary(salary);

    }
    // Action or Business Method
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    // Accessor Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

    public void takeVacation() {
    }
}