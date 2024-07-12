package com.hr.client;

import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;
import com.hr.Employee;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
Employee emp = new Employee("London");

        /* TODO: call goToWork() on the Employee object (command, option, B) */
        try {
            emp.goToWork();
        } catch (WorkException e) {

            // System.out.println(e.getMessage());   // extract the "reason string"
            // System.out.println(e.getCause());
            // e.printStackTrace();
            System.out.println(e);
        }

    }
}