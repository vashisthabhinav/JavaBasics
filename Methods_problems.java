package com.company.beginer;
import java.util.Scanner;

public class Methods_problems {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int  sum_recursion(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+ sum_recursion(n-1);
        }
    }
    static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        //if (n==1){
        //    return 0;
        //}
        //else if (n==2){
        //    return 1;
        //}//Two ways
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    static int avg(int ...arr){
        int sum=0,avg=0;
        for(int a:arr){
            sum += a;
            avg = sum/ arr.length;
        }
        return avg;
    }
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static float temp(float x){
        float y=9*x/5f+32f;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         //Question 1
//        int n1;
//        System.out.println("Enter n for multiplication table: ");
//        n1 = sc.nextInt();
//        multiplication(n1);
//        // Question 2
//        System.out.println("Enter n for Triangle formation: ");
//        int n2= sc.nextInt();
//        pattern1(n2);
//        // Question 3
//        System.out.println("Enter n to calculate sum of first 'n' natural numbers");
//        int n3 = sc.nextInt();
//        int c= sum_recursion(n3);
//        System.out.printf("Sum of first %d natural numbers is: %d",n3,c);
        // Question 4
        pattern2(4);
//        // Question 5
        // Fibonacci Sequence is the series of numbers: 0, 1, 1, 2 3, 5, 8, 13, 21, 34, ...
//        System.out.println("Enter n for Fibonacci Sequence: ");
//        int n5 = sc.nextInt();
//        int result = fib(n5);
//        System.out.printf("The number at position no. %d is %d",n5,result);
//        //Question 6
//        int avg= avg(12,30,48);
//        System.out.print("The average is: ");
//        System.out.println(avg);
//        // Question 8
//        pattern1_rec(8);
//        // Question 9
        System.out.println("Enter Temperature in Celcius scale:");
        float n9 = sc.nextFloat();
        float c = temp(n9);
        System.out.println(c);
    }
}
