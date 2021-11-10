package com.company.beginer;
import java.util.Scanner;
public class Strings_Introduction {
    public static void main(String[] args) {
         //String name = new String("Abhinav Vashisth");
         String name = "Abhinav Vashisth";
         System.out.print("My name is: ");
         System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f\n", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.println("Enter the sentence:");
        Scanner sc = new Scanner(System.in);
        //String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
