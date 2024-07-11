package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public Executive() {
        super();
    }
    public Executive(String name, LocalDate hireDate) {

        super(name, hireDate);
    }
    public Executive(String name, LocalDate hireDate, double salary) {

        super(name, hireDate, salary);
    }
    @Override // interface TaxPayer (default method)
    public double fileReturn() {
        System.out.println("Return filed electronically");

        return 0;
    }

    @Override
    public double getStandarDeduction() {
        return 0.5 * getSalary();
    }

    // Business Methods
    public void work(){
        System.out.println(getName() + " is enjoying 18 holes of golf");

    }
    }

