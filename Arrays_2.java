package com.company.beginer;

public class Arrays_2 {
    public static void main(String[] args) {

//        float [] marks = {9.5f, 5.5f, 6.5f, 93.5f, 8.5f};
//        String [] students ={"Abhinav", "Pj", "Chirag"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int[] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length);

        // Displaying the Array (Simple method)
        System.out.println("Printing using Simple method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        //Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}