package com.company.beginer;
public class Varargs {
//    static int sum(int x, int y){
//        int sum = x+y;
//        return sum;
//    }
//    static int sum(int x, int y,int z){
//        int sum = x+y+z;
//        return sum;
//    }
    // Varargs
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr) {
            result += a;
            }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Varargs");
        System.out.println("Sum of 2 and 3 is: " + sum(2, 3));
        System.out.println("Sum of 2, 4  and 3 is: " + sum(2, 4, 3));
        System.out.println("Sum of 1,2,3,4,5,6,7,8,9 & 10 is: " +sum(1,2,3,4,5,6,7,8,9,10));
    }
}