package com.company.beginer;
import java.util.Scanner;
public class Loops_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice Problem 1
        int n1;
        System.out.println("For Reverse Triangle of '*'\nEnter the number of '*'s in first row:");
        n1 = sc.nextInt();
        for (int i=n1; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        //Practice Problem 2
//        int sum2=0;
//        int n2;
//        System.out.println("Program to print sum of first n even numbers:\nEnter the value of n");
//        n2 = sc.nextInt();
//        for(int i=0;i<n2;i++){
//            sum2 = sum2 + (2*i);
//        }
//        System.out.print("Sum of n even numbers is: ");
//        System.out.println(sum2);
//
//        //Practice Problem 3
//        int n3;
//        System.out.println("Program to print Mutiplication of given number n till nx10\nEnter the value of n");
//        n3 = sc.nextInt();
//
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n3, i, n3*i);
//        }
//
//        //Practice Problem 4
//        int n4;
//        System.out.println("Program to print Mutiplication of given number n from nx10 in reverse order" +
//                "\nEnter the value of n");
//        n4 = sc.nextInt();
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n4, i, n4*i);
//        }
//
//        //Practice Problem 6
//        int n;
//        System.out.println("Factorial of n\nEnter the value of n");
//        n = sc.nextInt();
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
//
//        //Practice Problem 9
//        int n9;
//        System.out.println("Program to calculate sum of the numbers occuring in the multiplication table of n" +
//                "\n Enter the value of n");
//        n9 = sc.nextInt();
//        int sum9 = 0;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i9=1;i9<=10;i9++){
//            sum9 += n9*i9;
//        }
//        System.out.println(sum9);

    }
}
