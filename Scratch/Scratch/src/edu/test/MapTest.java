package edu.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();     // Key: string, value: do

        gpaMap.put("kea", 4.0);
        gpaMap.put("jasmin", 3.6);
        gpaMap.put("kelvin", 3.0);
        gpaMap.put("deshon", 2.4);
        gpaMap.put("tyler", 1.9);

        Double jasminGpa = gpaMap.get("jasmin");
        System.out.println("Jasmin's Gpa was: " + jasminGpa);
        System.out.println();
        
        dump(gpaMap);
        System.out.println();

        // print all g.p.a's that are 3.5 or >
        Collection<Double> gpas = gpaMap.values();  // returns Collection<V>, i.e. Collection<Double>
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);

            }
        }
        System.out.println();
        // print all names of those with a gpa of 2.5 or >
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 2.5) {
                System.out.println(entry.getKey());
            }

        }
        System.out.println();
    }

    private static void dump(Map<String,Double> gpaMap) {
        for (Map.Entry<String,Double> entry : gpaMap.entrySet()) {          // A collections of rows.
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}