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

    // Business Methods
    public void work(){

    }
    }

