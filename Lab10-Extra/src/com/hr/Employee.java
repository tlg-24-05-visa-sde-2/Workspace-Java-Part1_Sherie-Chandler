package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * Option 1: try catch and handle
     * Note: it is critical that stop() gets called, no matter what.
     */
    /* public void goToWork() {
        Car c = new Car("ABC123", "BMW", "LI750");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e); // toString() automatically called.
        } finally {
            c.stop();
        }
    } */

    // Option 2: "punt or duck", i.e. ignore the exception, do not deal with it.
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "BMW", "LI750");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();
        }
    }
    */

    /* Option 3: Try-Catch, "React/Respond in some way," then rethrow the exception by sending a text or an email then rethrow it back to my client. */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "BMW", "LI750");
        try {
            c.start();
            c.moveTo("Seattle");
        }
        catch(DestinationUnreachableException e) {
            // use the Java Mail API to send an email to Joe Biden, to complain about the high interest rates on student loans.
            throw e;
        }
        finally {
            c.stop();
        }
    }
    */

    /*
     * Option 4: Try-Catch, and throw a different one back at my client.
     * We "nest" or "wrap" the low level transportation orientation exception ("cause") into a high level, business oriented, WorkException, part of the HR package.
     */
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "BMW", "LI750");
        try {
            c.start();
            c.moveTo("Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);  // include the nested "cause".
        } finally {
            c.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}
