package edu.taylor.modulo5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Anonymous Classes
        List<Country> names = new ArrayList<>();
        names.add(new Country("Brazil"));
        names.add(new Country("Canada"));
        names.add(new Country("United States of America"));
        names.add(new Country("Eslovaquia"));
        names.add(new Country("China"));
        names.add(new Country("Italy"));
        names.add(new Country("Mexico"));

        names.sort(new Comparator<Country> () {
            @Override
            public int compare(Country s1, Country s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        List<Country> list1 = new ArrayList<Country>(names);

        // Lambdas and Reference Methods
        names.sort(Comparator.comparing((Country name) -> (name.getName())));
        List<Country> list2 = new ArrayList<Country>(names);

        names.sort(Comparator.comparing(Country::getName));
        List<Country> list3 = new ArrayList<Country>(names);

        System.out.println(names);
        System.out.println("Are all lists the same: " + ((list1 == list2) == (list2 == list3)));

        names.forEach(s -> System.out.print(s + " -> "));
        System.out.print("null");

        System.out.print("All countries with names longer than 5 chars: ");
        names.stream()
            .map(Country::getName)
            .filter(name -> (name.length() > 5))
            .forEach(System.out::println);
    }
}
