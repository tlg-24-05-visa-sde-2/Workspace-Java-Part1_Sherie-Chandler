package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private double rate;
    private double hours;

    // ctors are not inherited
    public HourlyEmployee() {
        super(); // a super class object must be called
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setRate(rate);          // handle rate here, by delegating to setter
        setHours(hours);        // handle hours here, by delegating to setter
    }

    // Actions or Business Methods
   @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " + payment);
    }

    // accessor methods
    public void pay (){
        public double getRate() {
            return rate;
        }
    }


    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ",  + hours=" + getHours();
    }
}