package com.company.beginer;
import java.util.Scanner;
public class Arrays_problems {
    public static void main(String[] args) {
        //Practice Problem 1
        System.out.println("Practice Problem 1");
        float [] marks1 = {39.6f, 123.8f, 39.7f, 99.8f, 120.0f};
        float sum1 = 0;
        for(float element:marks1){
            sum1 = sum1 + element;
        }
        System.out.println("The value of sum is: " + sum1);


        //Practice Problem 2
        System.out.println("Practice Problem 2");
        float [] marks2 = {12,21,30,39,48,57};
        float num ;
        System.out.println("Enter a Number:");
        Scanner sc= new Scanner(System.in);
        num = sc.nextFloat();
        boolean isInArray = false;
        for(float element:marks2){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }


        // Practice Problem 3
        System.out.println("Practice Problem 3");
        float m31,m32,m33,m34,m35;
        System.out.println("Enter 5 numbers whose average is to be calculated: ");
        Scanner sc31 = new Scanner(System.in);
        m31 = sc31.nextFloat();
        Scanner sc32 = new Scanner(System.in);
        m32 = sc31.nextFloat();
        Scanner sc33 = new Scanner(System.in);
        m33 = sc31.nextFloat();
        Scanner sc34 = new Scanner(System.in);
        m34 = sc31.nextFloat();
        Scanner sc35 = new Scanner(System.in);
        m35 = sc31.nextFloat();

        float [] marks3 = {m31,m32,m33,m34,m35};
        float sum3 = 0;
        for(float element:marks3){
            sum3 = sum3 + element;
        }
        System.out.println("The value of average marks is " + sum3/marks3.length);


        // Practice Problem 4
        System.out.println("Practice Problem 4");
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
        System.out.println("Practice Problem 5");
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

        // Practice Problem 6
        System.out.println("Practice Problem 6");
        int [] arr6 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr6){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: "+ max);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Practice Problem 7
        int [] arr7 = {1, 2100, 3, 455, 5, 34, 67};
        int min = Integer.MAX_VALUE;
        for(int e: arr7){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of the minimum element in this array is: "+ min);


        // Practice Problem 8
        boolean isSorted = true;
        int [] arr8 = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr8.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
