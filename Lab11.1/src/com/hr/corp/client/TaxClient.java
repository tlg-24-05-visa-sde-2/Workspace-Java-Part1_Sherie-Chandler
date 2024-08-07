/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp.client;

import com.hr.corp.Corporation;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IRS;

import java.time.LocalDate;

class TaxClient {
    
    public static void main(String[] args) {
        // create the IRS
        IRS irs = new IRS();
        
        // create the Corporation and register it with the IRS
        Corporation corp = new Corporation("HR, Inc.");
        irs.register(corp);

        // create Employees (Hourly or Salaried), and register them with the IRS
        irs.register(new HourlyEmployee("John",  LocalDate.of(1990, 8, 24), 22.5, 40.0));
        irs.register(new SalariedEmployee("Jacob", LocalDate.of(2000, 2, 2), 1250.0));
        irs.register(new HourlyEmployee("Ji",   LocalDate.of(2010, 10, 11), 25.0, 40.0));
        irs.register(new SalariedEmployee("Jane", LocalDate.of(2005, 7, 1), 1500.0));
        irs.register(new Executive("Jay", LocalDate.of(2021, 1,1), 1_000_000.0));


        // IRS collects taxes
        System.out.println("IRS collects taxes:");
        irs.collectTaxes();
    }
}