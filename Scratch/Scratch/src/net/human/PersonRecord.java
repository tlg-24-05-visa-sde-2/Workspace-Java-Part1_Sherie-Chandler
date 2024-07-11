package net.human;

import java.time.LocalDate;
import java.time.Period;

public record PersonRecord(String name, LocalDate birthDate) {

    public int age() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);
        return period.getYears();
    }
}
