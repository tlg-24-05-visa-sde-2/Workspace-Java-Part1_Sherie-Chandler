/*
 * An immutable class.
 * That is, a class definition written in such a way that instance of it (Person objects),
 * once created, cannot have their properties changed.
 * There are simply no public methods to do so, i.e., getters, but No setters.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This is the period of time between the birthdate and today's date
     * This is a derived property that is calculated from existing data not a new field---the period.
     */

    public int age() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        return period.getYears();
    }

    // calculate it in one line
    /*
    public int age() {
    return Period.between(birthDate(), LocalDate.now()).getYears();
    }
    */

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", name(), birthDate());
    }
}
