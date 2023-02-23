package edu.taylor.modulo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        listCollection();
    }

    public static void listCollection() {
        // Adiciona 6 notas do aluno
        List<Double> grades = new ArrayList<>();
        grades.add(6.0);
        grades.add(3.7);
        grades.add(8.5);
        grades.add(6.5);
        grades.add(5.2);
        grades.add(9.1);
        System.out.println(grades);

        // Pega posição da nota de valor 6.5
        System.out.println("Grade 6.5 is at position index " + grades.indexOf(6.5));

        // Adiciona uma nota 8.0 na posição 4
        grades.add(4, 8d);
        System.out.println("Grade 8.0 added at position 4");

        // Substitui a nota 5.2 por 6.0
        grades.set(grades.indexOf(5.2), 6.0);
        System.out.println("Grade 5.2 replaced by 6.0");

        // Checa se existe uma nota 4.2
        System.out.println("A nota 4.2 existe: " + grades.contains(4.2));

        // Show all grades individually
        for (Double grade : grades)
            System.out.print("Grade " + grade + " ");

        // Lowest grade
        System.out.println("Lowest grade: " + Collections.min(grades));

        // Highest grade
        System.out.println("Highest grade: " + Collections.max(grades));

        // Sum of grades
        Iterator<Double> iterator = grades.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double nextValue = iterator.next();
            sum += nextValue;
        }
        System.out.println("Sum of all grades: " + sum + ", average: " + (sum / grades.size()));
    }
}
