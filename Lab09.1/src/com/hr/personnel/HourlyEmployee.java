package com.hr.personnel;

import gov.irs.TaxPayer;

import java.io.Serializable;
import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {
    // PROPERTIES
    private double rate;
    private double hours;

    //METHODS
    @Override
    public void pay(){
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " + payment);
    }

    // CONSTRUCTORS
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate) {
        this(name, hireDate);
        setRate(rate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate, rate);
        setHours(hours);
    }

    @Override // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " is paid taxes " + taxes);
    }

    // ACCESSOR METHODS
    public double getRate() {
        return rate;
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
        return super.toString()
                + ", rate=" + getRate()
                + ", hours=" + getHours();
    }
}