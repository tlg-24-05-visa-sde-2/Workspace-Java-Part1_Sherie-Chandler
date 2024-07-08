package net.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("ByteBear", LocalDate.of(1987, 01, 01)); // NULL

        // print the following <name> is <age> years old
        System.out.printf("% is % years old \n", p1.name(), p1.age());


        System.out.println(p1);

    }
}
