package com.company.beginer;
import java.util.Scanner;
public class If_else_intro {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if (a>=18&&a<=75) {
            System.out.println("You can Drive");
        }
        else{
            System.out.println("You cannot Drive");
        }
    }
}
