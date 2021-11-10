package com.company.beginer;
class Students{
    int rollno;
    String name;
    public void printDetails(){
        System.out.print("My name is: "+name);
        System.out.println(" and my Roll No. is: "+rollno);
    }
}
public class OOPs {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Students abhinav = new Students();
        abhinav.name = "Abhinav Vashisth";
        abhinav.rollno = 10;
        abhinav.printDetails();
    }
}
