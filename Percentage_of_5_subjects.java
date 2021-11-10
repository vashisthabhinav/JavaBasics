package com.company.beginer;
import java.util.Scanner;
public class Percentage_of_5_subjects {
    public static void main(String[] args) {
        System.out.println("Marks of the student- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks which can be stored in 1 subject: ");
        float t= sc.nextFloat();
        System.out.println("Enter the marks of Subject 1: ");
        float a= sc.nextFloat();
        System.out.println("Enter the marks of Subject 2: ");
        float b= sc.nextFloat();
        System.out.println("Enter the marks of Subject 3: ");
        float c= sc.nextFloat();
        System.out.println("Enter the marks of Subject 4: ");
        float d= sc.nextFloat();
        System.out.println("Enter the marks of Subject 5: ");
        float e= sc.nextFloat();
        float percentage=(a+b+c+d+e)/(5*t)*100;
        System.out.println("The percentage of the student is: ");
        System.out.println(percentage);
    }
}
