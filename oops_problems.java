package com.company.beginer;
import java.util.Scanner;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling friend...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class Circle{
    int r;
    public float area(){
        float x=22/7f;
        return x*r*r;
    }
    public float circumference(){
        float x=22/7f;
        return 2*x*r;
    }
}
public class oops_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problem 1
        Employee abhinav = new Employee();
        abhinav.setName("CodeWithHarry");
        abhinav.salary = 233;
        System.out.println(abhinav.getSalary());
        System.out.println(abhinav.getName());

        // Problem 2
        CellPhone samsung = new CellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();


        // Problem 3
        Square sq = new Square();
        System.out.println("Enter the value of side to calculate perimeter and area of a square:");
        int n3= sc.nextInt();
        sq.side=n3;
        System.out.print("The area is: ");
        System.out.println(sq.area());
        System.out.print("The perimeter is: ");
        System.out.println(sq.perimeter());
        // Problem 4
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter the value of length(l) and breadth(b)" +
                " to calculate perimeter and area of a rectangle:");
        int l= sc.nextInt();
        int b= sc.nextInt();
        rectangle.l=l;
        rectangle.b=b;
        System.out.print("The area is: ");
        System.out.println(rectangle.area());
        System.out.print("The perimeter is: ");
        System.out.println(rectangle.perimeter());
        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
        // Problem 6
        Circle circle = new Circle();
        System.out.println("Enter the value of side to calculate circumference and area of a circle:");
        int n6= sc.nextInt();
        circle.r = n6;
        System.out.print("The area is: ");
        System.out.println(circle.area());
        System.out.print("The circumference is: ");
        System.out.println(circle.circumference());
    }
}
