package com.company.beginer;
import java.util.Scanner;
public class Natural_num_reverse_order {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=a;i>0;i--){
            System.out.println(i);
        }
    }
}
