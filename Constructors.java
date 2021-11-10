package com.company.beginer;
class Employee1 {
    // First constructor
    Employee1(String s, int i){
        System.out.println("The name of the  employee is : " + s);
        System.out.println("The id of the  employee is : " + i);
    }
    //    Constructor overloaded
    Employee1(String s, int i, int salary){
        System.out.println("The name of the  employee is : " + s);
        System.out.println("The id of the  employee is : " + i);
        System.out.println("The salary of  employee is : " + salary);
    }

}
public class Constructors {
    public static void main(String[] args) {
        Employee1 abhinav = new Employee1("Abhinav Vashisth",10,70000);
    }
}
