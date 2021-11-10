package com.company.beginer;
import java.util.Scanner;

public class Methods_intro {
    static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }
    static void sum(){
        System.out.println("Method Overloading");
    }
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the value of two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sum(a,b);
        System.out.print("The sum is: ");
        System.out.println(c);
        sum();
    }
}
