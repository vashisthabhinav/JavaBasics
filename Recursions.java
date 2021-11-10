package com.company.beginer;
import java.util.Scanner;

public class Recursions {
    // factorial(n) = n * factorial(n-1)

    static int factorial_recursions(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial_recursions(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the value of x to find its factorial: ");
        Scanner sc =  new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("The value of factorial x is: (using recursions)" + factorial_recursions(x));
        System.out.println("The value of factorial x is (using iterative): " + factorial_iterative(x));

    }
}


