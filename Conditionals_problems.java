package com.company.beginer;
import java.util.Scanner;
public class Conditionals_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1:
        int a = 11;
        if(a==11){
            System.out.println("Difference in = and ==");
        }

        //Question 2
        byte m1, m2, m3,m4,m5;

        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2= sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        System.out.println("Enter your marks in English");
        m4 = sc.nextByte();
        System.out.println("Enter your marks in Physical Education");
        m5 = sc.nextByte();
        float avg = (m1+m2+m3+m4+m5)/5.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 && m4>=33 && m5>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }

        //Question 3
        System.out.println("Enter your income in Rupees");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=250000f){
            tax = tax + 0;
        }
        else if(income>250000f && income <= 500000f){
            tax = tax + 0.05f * (income - 250000f);
        }
        else if(income>500000f && income <= 1000000f){
            tax = tax + 0.2f * (income - 500000f);
        }
        else if(income>1000000f){
            tax = tax + 0.3f * (income - 1000000f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);

        //Question 4:
        System.out.println("Enter the number(Switch Case Statement)");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        //Question 5
        int year;
        System.out.println("Enter the year");
        year = sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("It is a Leap Year");
                }
                else {
                    System.out.println("It is not a Leap Year");
                }
            }
            else {
                System.out.println("It is a Leap Year");
            }
        }
        else {
            System.out.println("It is not a Leap Year");
        }
        //Question 6
        System.out.println("Enter type of website");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
